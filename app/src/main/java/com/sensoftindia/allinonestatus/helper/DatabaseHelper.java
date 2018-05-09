package com.sensoftindia.allinonestatus.helper;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


import com.sensoftindia.allinonestatus.model.PointTable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class DatabaseHelper extends SQLiteOpenHelper {

	// Logcat tag
	private static final String LOG = "DatabaseHelper";

	// Database Version
	private static final int DATABASE_VERSION = 3;

	// Database Name
	private static final String DATABASE_NAME = "/mnt/sdcard/status.db";

	// Tab	le Names
	private static final String TABLE_STATUS = "status";
	private static final String TABLE_USED_STATUS = "used_status";

	// Common column names
	private static final String KEY_ID = "id";
	private static final String KEY_CREATED_AT = "created_at";

	// status one Table - column nmaes
	private static final String KEY_FAVOURITE_STATUS = "favourite_status";
	private static final String KEY_USED_STATUS = "use_status";



	// status one Create Statements
	// Todo table create statement
	private static final String CREATE_TABLE_PLAYER_ONE = "CREATE TABLE "
			+ TABLE_STATUS + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_FAVOURITE_STATUS + " TEXT," + KEY_CREATED_AT
			+ " DATETIME" + ")";

	private static final String CREATE_TABLE_USED_STATUS = "CREATE TABLE "
			+ TABLE_USED_STATUS + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_USED_STATUS + " TEXT," + KEY_CREATED_AT
			+ " DATETIME" + ")";




	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {

		// creating required tables
		db.execSQL(CREATE_TABLE_PLAYER_ONE);
		db.execSQL(CREATE_TABLE_USED_STATUS);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// on upgrade drop older tables
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_STATUS);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_USED_STATUS);


		// create new tables
		onCreate(db);
	}


	// ------------------------ "Status" table methods ----------------//

	/*
	 * Creating status table
	 */
	public long createTableOne(PointTable points) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_FAVOURITE_STATUS, points.getPoints());
		values.put(KEY_CREATED_AT, getDateTime());

		// insert row
		long tag_id = db.insert(TABLE_STATUS, null, values);

		return tag_id;
	}

	/**
	 * getting all status from table one
	 * */
	public List<PointTable> getAllPointsFromTableOne() {

		List<PointTable> pointsList = new ArrayList<PointTable>();

		String selectQuery = "SELECT  * FROM " + TABLE_STATUS;

		Log.e(LOG, selectQuery);

		SQLiteDatabase db = this.getReadableDatabase();
		Cursor c = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to list
		if (c.moveToFirst()) {
			do {
				PointTable t = new PointTable();
				t.setId(c.getInt((c.getColumnIndex(KEY_ID))));
				t.setPoints(c.getString(c.getColumnIndex(KEY_FAVOURITE_STATUS)));

				// adding to point list
				pointsList.add(t);
			} while (c.moveToNext());
		}
		return pointsList;
	}

	/*
	 * Updating a status table one
	 */
	public int updatePointTable(PointTable points) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_FAVOURITE_STATUS, points.getPoints());

		// updating row
		return db.update(TABLE_STATUS, values, KEY_ID + " = ?",
				new String[] { String.valueOf(points.getId()) });
	}

	public void deleteStatus(long tado_id) {
		SQLiteDatabase db = this.getWritableDatabase();
		db.delete(TABLE_STATUS, KEY_ID + " = ?",
				new String[] { String.valueOf(tado_id) });
	}

	public void deleteFavouriteStatus(String tado_id) {
		SQLiteDatabase db = this.getWritableDatabase();
		db.delete(TABLE_STATUS, KEY_ID + " = ?",
				new String[] { String.valueOf(tado_id) });
	}


	// ------------------------ "Used Status" table methods ----------------//

	/*
	 * Creating used status table
	 */
	public long createTableUsed(PointTable points) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_USED_STATUS, points.getPoints());
		values.put(KEY_CREATED_AT, getDateTime());

		// insert row
		long tag_id = db.insert(TABLE_USED_STATUS, null, values);

		return tag_id;
	}

	/**
	 * getting all status from table one
	 * */
	public List<PointTable> getAllStatusFromTable() {

		List<PointTable> pointsList = new ArrayList<PointTable>();

		String selectQuery = "SELECT  * FROM " + TABLE_USED_STATUS;

		Log.e(LOG, selectQuery);

		SQLiteDatabase db = this.getReadableDatabase();
		Cursor c = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to list
		if (c.moveToFirst()) {
			do {
				PointTable t = new PointTable();
				t.setId(c.getInt((c.getColumnIndex(KEY_ID))));
				t.setPoints(c.getString(c.getColumnIndex(KEY_USED_STATUS)));

				// adding to point list
				pointsList.add(t);
			} while (c.moveToNext());
		}
		return pointsList;
	}

	/*
	 * Updating a status table one
	 */
	public int updateUsedStatus(PointTable points) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_USED_STATUS, points.getPoints());

		// updating row
		return db.update(TABLE_USED_STATUS, values, KEY_ID + " = ?",
				new String[] { String.valueOf(points.getId()) });
	}


	public void deleteUsedStatus(String tado_id) {
		SQLiteDatabase db = this.getWritableDatabase();
		db.delete(TABLE_USED_STATUS, KEY_ID + " = ?",
				new String[] { String.valueOf(tado_id) });
	}


	// closing database
	public void closeDB() {
		SQLiteDatabase db = this.getReadableDatabase();
		if (db != null && db.isOpen())
			db.close();
	}

	/**
	 * get datetime
	 * */
	private String getDateTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss", Locale.getDefault());
		Date date = new Date();
		return dateFormat.format(date);
	}
}
