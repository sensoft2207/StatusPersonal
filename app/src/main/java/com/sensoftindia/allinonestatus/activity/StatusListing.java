package com.sensoftindia.allinonestatus.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.sensoftindia.allinonestatus.R;
import com.sensoftindia.allinonestatus.adapter.StatusAdapter;
import com.sensoftindia.allinonestatus.model.HaptoData;

import java.util.ArrayList;

/**
 * Created by mxi on 30/12/17.
 */

public class StatusListing extends AppCompatActivity {

    ImageView iv_back;
    TextView status_c_name;
    RecyclerView rc_hapto_member_list;

    StatusAdapter mAdapter;

    ArrayList<HaptoData> member_list;

    String s_name;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_hapto_activity);

       init();

        mAdView = (AdView) findViewById(R.id.adView);



        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                // Check the LogCat to get your test device ID
               // .addTestDevice("5ABF1C85B25F8307141BF8160DD42CD3")
                .build();


        mAdView.loadAd(adRequest);
    }

    private void init() {

        s_name = getIntent().getStringExtra("c_name");

        iv_back = (ImageView)findViewById(R.id.iv_back);
        status_c_name = (TextView) findViewById(R.id.status_c_name);
        rc_hapto_member_list = (RecyclerView) findViewById(R.id.rc_hapto_member_list);
        rc_hapto_member_list.setLayoutManager(new LinearLayoutManager(StatusListing.this));
        rc_hapto_member_list.setItemAnimator(new DefaultItemAnimator());

        status_c_name.setText(s_name);



        if (s_name.equals("Love Status")){


            loveStatus();


        }else if (s_name.equals("Sad Status")){

            sad();

        }else if (s_name.equals("Cool Status")) {

            cool();

        }else if (s_name.equals("Attitude Status")) {

            attitude();

        }else if (s_name.equals("Funny Status")) {

           funny();

        }else if (s_name.equals("Motivational Status")) {

          motivational();

        }else if (s_name.equals("Angry Status")) {

            angry();

        }else if (s_name.equals("Breakup Status")) {

           breakUp();

        }else if (s_name.equals("Miss you Status")) {

            missYou();

        }else if (s_name.equals("Gym/Fitness Status")) {

            gymFitness();

        }else if (s_name.equals("Alone Status")) {

            alone();

        }else if (s_name.equals("Heart Touching Status")) {

          heartTouching();

        }else {

        }


        mAdapter = new StatusAdapter(member_list, R.layout.add_hapto_rc_item,StatusListing.this);
        rc_hapto_member_list.setAdapter(mAdapter);

        clickListner();
    }

    private void loveStatus() {

        member_list = new ArrayList<HaptoData>();
        member_list.add(new HaptoData("I don’t like waiting, I’m so impatient. But I’ll wait forever, as long as I end up with u."));
        member_list.add(new HaptoData("Everyone says u fall in love only ones, but i fall daily with the same person."));
        member_list.add(new HaptoData("Every moment I spent with you.. is like beautiful dream come true."));
        member_list.add(new HaptoData("Nothing is fine, but when I’m with you everything is fine."));
        member_list.add(new HaptoData("Can I borrow a Kiss? I promise I’ll give it back."));
        member_list.add(new HaptoData("Love me 4 a second and I’ll love you forever."));
        member_list.add(new HaptoData("The person who makes u happiest is the person who can hurt you the most."));
        member_list.add(new HaptoData("When I’m sad don’t look at me – just kiss me "));
        member_list.add(new HaptoData("I want to run away with you. Where there is only you and me."));
        member_list.add(new HaptoData("I fell in love with u, I don’t know why or how. I just did."));
        member_list.add(new HaptoData("No matter how “busy” a person is…if they really love, they will always find the time for you.!"));
        member_list.add(new HaptoData("Love is like a Air ..We can’t see it but! we can feel it.."));
        member_list.add(new HaptoData("Love in Life ,Make the life beautiful.."));
        member_list.add(new HaptoData("In life I need only you!"));
        member_list.add(new HaptoData("My “Heart” is always your!"));
        member_list.add(new HaptoData("Love is like the sun which coming out from the clouds and warming your soul."));
        member_list.add(new HaptoData("True Love = No doubts + No jealousy + No worries then life is good"));
        member_list.add(new HaptoData("In love Never say “Sorry”!"));
        member_list.add(new HaptoData("When I think about you…I don’t feel so alone…"));
        member_list.add(new HaptoData("Love is that ,which can never explained"));
        member_list.add(new HaptoData("Love is That Which can not see the Religious ,Caste ,Rich ,Poor in life..."));
        member_list.add(new HaptoData("My love for you is a journey that starts at forever and ends at never in Life…"));
        member_list.add(new HaptoData("If you truly love someone, then the only thing you want do for them is to be happy….even if you are not with him..."));
        member_list.add(new HaptoData("Time goes by a very slower when you miss the someone who love you."));
        member_list.add(new HaptoData("There is No Scale To Measure the love."));
        member_list.add(new HaptoData("Love is not about how much u say “i love you” but how much u can prove that it’s true."));
        member_list.add(new HaptoData("The best feeling is when you look at the one you love and they’re already looking at u"));
        member_list.add(new HaptoData("You’re the reason behind my smile..."));
        member_list.add(new HaptoData("Nothing is perfect, but when I’m with u everything is perfect."));
        member_list.add(new HaptoData("I love my life because it gave me u I love you because u are my life."));
        member_list.add(new HaptoData("There are only 2 times that I want to be with you Now and Forever."));
        member_list.add(new HaptoData("A man in love is incomplete until he is married with her love. Then he’s finished."));
        member_list.add(new HaptoData("Love is the only thing that  control every single emotion you have."));
        member_list.add(new HaptoData("Love never fails and when it fails in life, then its not love!"));
        member_list.add(new HaptoData("The TRUTH hurts only once but a LIE hurts every time u remember it!"));
        member_list.add(new HaptoData("Behind every successful man is a surprised woman"));
        member_list.add(new HaptoData("Na Jaane Kyun Aapko Dekthe Hi Hum Khamosh Ho Gaye"));
        member_list.add(new HaptoData("Thinking of u is easy, I do it every day. Missing u is the heartache that never goes away."));
        member_list.add(new HaptoData("Love is master key of opening a gate of happiness…"));
        member_list.add(new HaptoData("If you were thinking about someone ,while Studying you’re definitely in Love…"));
        member_list.add(new HaptoData("Always Love your GB from your Heart not from your mood or Mind.."));
        member_list.add(new HaptoData("Love is like a rubber band, when both can stretch ,and then one can release then it can heart the other!"));
        member_list.add(new HaptoData("You have no idea how fast my heart beats when I see you!"));
        member_list.add(new HaptoData("Not even, my whole heart can hold the amount of love I feel for you."));
        member_list.add(new HaptoData("I love you, your looks caught my eye, your smile made my heart skip a beat,your hugs gave me butterflies. But you loving me? There are no words for my happiness."));
        member_list.add(new HaptoData("Love is a game. He who said “I love you” first lost it."));
        member_list.add(new HaptoData("I love your eyes, your smile, your voice words… I love you."));
        member_list.add(new HaptoData("I want you, I want all of you, forever, everyday,you and me, every day."));
        member_list.add(new HaptoData("True love never dies it only gets stronger with time!"));
        member_list.add(new HaptoData("We cannot fall in love for the second time if we really fell out of love."));
        member_list.add(new HaptoData("I am not with you but my love will always be lingering around you love you my sweetheart."));
        member_list.add(new HaptoData("I love you yesterday, I love you still I always have I always will."));
        member_list.add(new HaptoData("Falling in love with you is the second best thing in the world,Finding you is the first."));
        member_list.add(new HaptoData("I cry because I miss you, I smile because I love you and I breathe because you’re here, somewhere, somehow. You’re here. And you’re mine."));
        member_list.add(new HaptoData("In your arms is the only place I want to be alone."));
        member_list.add(new HaptoData("When I fell for you I fell hard."));
        member_list.add(new HaptoData("People say great things don’t happen overnight,but overnight, I fell in love with you."));
        member_list.add(new HaptoData("I fell in love with you because you loved me when I couldn’t love myself"));

    }

    private void sad() {

        member_list = new ArrayList<HaptoData>();
        member_list.add(new HaptoData("True Love Isn’T Found. It’S Built."));
        member_list.add(new HaptoData("You Killed What Was Left Of The Good In Me."));
        member_list.add(new HaptoData("Sometimes All You Need Is One Person Who Cares."));
        member_list.add(new HaptoData("I’M That Person Everyone Replaces After A While. "));
        member_list.add(new HaptoData("I Don’T Care For The People, Who Don’T Care For Me."));
        member_list.add(new HaptoData("No Beauty Shines Brighter Than That Of A Good Heart. "));
        member_list.add(new HaptoData("If You Give Up On Me, I’M Going To Give Up On Me Too."));
        member_list.add(new HaptoData("I’Ve Been Sad For Years. Don’T Tell Me It Gets Better."));
        member_list.add(new HaptoData("Behind My Smile Is Everything You’Ll Never Understand."));
        member_list.add(new HaptoData("I Stay Home Alone, Listen To Music And Think Too Much. "));
        member_list.add(new HaptoData("The Worst Kind Of Sad Is Not Being Able To Explain Why."));
        member_list.add(new HaptoData("Tears Are Words Too Painful For A Broken Heart To Speak."));
        member_list.add(new HaptoData("I Like To Be Alone. But I Would Rather Be Alone With You."));
        member_list.add(new HaptoData(" I Say I Don’T Care Anymore, But Truth Is I Care Too Much."));
        member_list.add(new HaptoData("No Matter How Far You Are, You Are Always In My Thoughts."));
        member_list.add(new HaptoData(" I Am Tired Of Fightin. For Once, I Want To Be Fought For."));
        member_list.add(new HaptoData("I Hope You’Ll Realize How Much You’Re Hurting Me Some Day."));
        member_list.add(new HaptoData("Every Time I Trust Somebody, They Show Me Why I Shouldn’T."));
        member_list.add(new HaptoData("I Really Need To Stop Being So Emotional About Everything."));
        member_list.add(new HaptoData("The Root Of Disappointment Comes From Holding Expectation."));
        member_list.add(new HaptoData("It Hurts To Let Go, But Sometimes It Hurts More To Hold On."));
        member_list.add(new HaptoData("I Miss The The Time When I Actually Meant Something To You."));
        member_list.add(new HaptoData(" I Wanted To Text You But I Remembered We Don’T Talk Anymore."));
        member_list.add(new HaptoData("Oh, I’M Sorry. I Forgot. I Only Exist When You Need Something."));
        member_list.add(new HaptoData("Smiling Has Always Been Easier Than Explaining Why You’Re Sad."));
        member_list.add(new HaptoData("I Wish My Brain Had A Map To Tell Me Where My Heart Should Go."));
        member_list.add(new HaptoData("Its So Hard To Pretend Not To Love A Person When You Really Do."));
        member_list.add(new HaptoData("Love Sometimes Comes Like A Dream And Leaves Likes A Nightmare."));
        member_list.add(new HaptoData("Sometimes It Takes Losing Something Realize To What You’Ve Had."));
        member_list.add(new HaptoData("I Feel Like I’ Waiting For Something That Isn’T Going To Happen."));
        member_list.add(new HaptoData("It’S Not That I Wanna Have It, It’S Just That I Wanna Deserve It."));
        member_list.add(new HaptoData("Trust Is Like Papers. Once It’S Crumpled It Can’T Be Perfect Again."));
        member_list.add(new HaptoData("It’S Sad How Most People Become Who They Promised They’D Never Be !"));
        member_list.add(new HaptoData("Even When I’M Hurting So Bad Inside, I’Ll Still Smile & Say I’M Fine."));
        member_list.add(new HaptoData("Wanted By Many, Taken By None, Talking To Some, Just Waiting For One."));
        member_list.add(new HaptoData("When People Treat You Like They Don’T Care, Believe Them. They Don’T."));
        member_list.add(new HaptoData("Every Birth Is Paid By Death & Every Happiness Is Paid By Unhappiness."));
        member_list.add(new HaptoData("You Know That Nothing Will Change, But For Some Reason You Still Wait."));
        member_list.add(new HaptoData("Sick Of Crying, Tired Of Trying, Yes I’M Smiling But Inside I’M Dying."));
        member_list.add(new HaptoData("There’S Nothing More Depressing Than Having It All & Still Feeling Sad."));
        member_list.add(new HaptoData("Technically, I Am Single. But My Heart Is Taken By Someone I Can;T Have."));
        member_list.add(new HaptoData("Love The Hearts That Hurts You, But Never Hurt The Heart That Loves You."));
        member_list.add(new HaptoData("A Relationship Is Only For Two, But Some Bitches Don’T Know How To Count."));
        member_list.add(new HaptoData("Use Your Smile To Change The World. Don’T Let The World Change Your Smile."));
        member_list.add(new HaptoData("You May Not Be Pushing Me Away But You’Re Not Fighting To Keep Me Either."));
        member_list.add(new HaptoData("Nobody Deserves Your Tears, But Whoever Deserves Them Will Not Make You Cry."));
        member_list.add(new HaptoData("Find Someone Who Knows That You’Re Not Perfect But Treats You As If You Are."));
        member_list.add(new HaptoData("The Word Happiness Would Lose Its Meaning If It Were Not Balanced By Sadness."));
        member_list.add(new HaptoData(" It’S Never The Tears That Measure The Pain, Sometimes Its Take Smile We Fake."));
        member_list.add(new HaptoData("I Feel Like A Balloon…Looking Bright & Cheerful, But Empty And Lonely Inside."));
        member_list.add(new HaptoData("The Toughest Part Of Letting Go Is Realizing That The Other Person Already Did."));
        member_list.add(new HaptoData(" I Keep Myself Busy With Things I Do But Every time I Pause, I Still Think Of You."));
        member_list.add(new HaptoData("You Lose Yourself Trying To Hold On To Someone Who Doesn’t Care About Losing You."));
        member_list.add(new HaptoData("And Sometimes You Just Have To Forget About That Person You Once Loved & Move On."));
        member_list.add(new HaptoData("People Cry Not Because They’Re Weak. Its Because They’ve Been Strong For Too Long."));
        member_list.add(new HaptoData("You Touched My Heart With A Thousand Pleasures And Broke It In To Million Pieces."));
        member_list.add(new HaptoData(" I Know They Say That First Love Is The Sweetest But That First Cut Is The Deepest."));
        member_list.add(new HaptoData(" I’M Not Upset That You Lied To Me, I’M Upset That From Now On I Can’T Believe You."));
        member_list.add(new HaptoData("Nothing Hurts More Than Realizing He Meant Everything To You & You Meant Nothing To Him."));
        member_list.add(new HaptoData("Everything’S Complicated, Even Those Things That Seem Flat In Their Bleakness Or Sadness."));
        member_list.add(new HaptoData("I Was Playing Back A Thousand Memories Baby, Thinking About Everything We’Ve Been Through."));
        member_list.add(new HaptoData("Words But Deeper Than Knives. A Knife Can Be Pulled Out, Words Are Embedded Into Out Soul."));
        member_list.add(new HaptoData("Yeah. She’S Smiling But Don’T Let That Fool You. Look Into Her Eyes. She’S Breaking Inside."));
        member_list.add(new HaptoData("People Change For Two Reason : They Have Learned A Lot Or They Have Been Hurt Too Many Times."));
        member_list.add(new HaptoData("Sometimes The Girl Who’S Always Been There For Everyone Else. Need Someone To Be There For Her."));
        member_list.add(new HaptoData("Everyone Want Happiness, No One Wants Pain, But You Can’T Make A Rainbow Without A Little Rain"));
        member_list.add(new HaptoData("There Are So Many Things That Make You Happy. Don’T Focus Too Much On Things That Make You Sad."));
        member_list.add(new HaptoData("Never Expect Things To Be Happen, Because It Better To Feel Surprised Than To Feel Disappointed."));
    }

    private void cool() {

        member_list = new ArrayList<HaptoData>();
        member_list.add(new HaptoData("Do What’s Right Not Easy."));
        member_list.add(new HaptoData("Keep Calm & Just Chill."));
        member_list.add(new HaptoData("Genius By Birth, Evil By Choice."));
        member_list.add(new HaptoData("Don’t Blame Me, I Was Born Awesome."));
        member_list.add(new HaptoData("All Girls Are My Sisters Except You."));
        member_list.add(new HaptoData("I’M Soo Cool, Ice Cubes Are Jealous."));
        member_list.add(new HaptoData(" I Am A Hot Dude With A Cool Attitude."));
        member_list.add(new HaptoData(" I Don’T Trust Words, I Trust Actions."));
        member_list.add(new HaptoData("A Sense Of Humor Makes A Man Handsome."));
        member_list.add(new HaptoData("I Love My Haters, They Make Me Famous."));
        member_list.add(new HaptoData("If You Are Bad, Then Call Me Your Dad."));
        member_list.add(new HaptoData("Totally Available!! Please Disturb Me!!"));
        member_list.add(new HaptoData("I Love Listening Lies When I Know Truth."));
        member_list.add(new HaptoData("I Am Not Perfect. I Am Limited Editions."));
        member_list.add(new HaptoData("It’S Not An Attitude, It’S The Way I Am."));
        member_list.add(new HaptoData("Plz Trust Me Dat I Dont Trust U At All."));
        member_list.add(new HaptoData("Home : Where I Can Look Ugly And Enjoy It."));
        member_list.add(new HaptoData("Before You Judge Make Sure You Are Perfect."));
        member_list.add(new HaptoData("Never Accept To Be Anyone’S Second Choice."));
        member_list.add(new HaptoData("Respect Those Who Deserve It Not Demand It."));
        member_list.add(new HaptoData("Put Me Second And I’Ll Make You Nonexistent."));
        member_list.add(new HaptoData(" I Salute All My Hater With My Middle Finger."));
        member_list.add(new HaptoData("Single Or Taken ? Who Cares ? I Am Awesome."));
        member_list.add(new HaptoData("Love Your Haters, They Are You Biggest Fans."));
        member_list.add(new HaptoData("Be Yourself; Everyone Else Is Already Taken."));
        member_list.add(new HaptoData("I Didn’T Lose My Mind. I Just Sold It Online."));
        member_list.add(new HaptoData("Nowadays, “Cool” Means- “I Really Don’T Care.”"));
        member_list.add(new HaptoData("You Attitude Can Hurt Me But Mine Can Kill You."));
        member_list.add(new HaptoData("Anyone Can Be Cool, But Awesome Takes Practice."));
        member_list.add(new HaptoData("My Every Status Is A Silent Message To Someone."));
        member_list.add(new HaptoData(" I Am So Single That For Me Gf Means Grandfather."));
        member_list.add(new HaptoData("Life Is To Short To Waste On Hating Other People."));
        member_list.add(new HaptoData("I Am Not Useless , I Can Be Used As A Bad Example."));
        member_list.add(new HaptoData("I An Not Lazy, I Am Just On My Energy Saving Mode."));
        member_list.add(new HaptoData("God Is Really Creative, I Mean…Just Look At M!!!"));
        member_list.add(new HaptoData("I Will Be Rising From The Ground Like A Skyscraper."));
        member_list.add(new HaptoData("I’M The Guy, U Will Hate Nd Your Sisters Will Date."));
        member_list.add(new HaptoData("I Tried To Be Normal. Worst Two Minutes Of My Life."));
        member_list.add(new HaptoData("Yes I Am Smiling And You’Re Not The Reason Anymore."));
        member_list.add(new HaptoData("I May Be Real Bad Boy, But Baby I’M A Real Good Man."));
        member_list.add(new HaptoData("People Say Me Bad.. But Assurance Me I Am The Worst!"));
        member_list.add(new HaptoData("My Attitude Will Always Be Based On How You Treat Me."));
        member_list.add(new HaptoData("Self Confidence Is The Best Outfit, Rock It & Own It."));
        member_list.add(new HaptoData("Sugar Factories Are Situated Under Girls Fb Statuses"));
        member_list.add(new HaptoData("I’M The Guy, U Will Hate Nd Your Sisters Will Date."));
        member_list.add(new HaptoData("Only Fools Fall In Love And I Think, I Am One Of Them."));
        member_list.add(new HaptoData("Warning!!! I Know Karate And Few Other Oriental Words."));
        member_list.add(new HaptoData("I Am Not Arguing, I’M Simply Explaining Why I Am Right."));
        member_list.add(new HaptoData("Its Good Thing To Feel Like You Have To Prove Something."));
        member_list.add(new HaptoData("She is My Best Friend. Break Her Heart. I’Ll Break Your Face."));
        member_list.add(new HaptoData("Dnt Luk Into My Eyes…. R Else U Will Fall Again In Luv."));
        member_list.add(new HaptoData("Always Give Your 100 Percent ….Unless You’R Donating Blood."));
        member_list.add(new HaptoData("Life Is Like Photography, You Use The Negatives To Develop."));
        member_list.add(new HaptoData("Always Remember That You Are Unique Just Life Everyone Else."));
        member_list.add(new HaptoData("I Love My Sixpack So Much, I Protect It With A Layer Of Fat."));
        member_list.add(new HaptoData("Better Days Are Coming. They Are Called : Saturday & Sunday."));
        member_list.add(new HaptoData("I Like It When People Look At My Status And Say “Impressive”."));
        member_list.add(new HaptoData("Don’T Like You ? I Don’T Wake Up Every Morning To Impress You."));
        member_list.add(new HaptoData("If Plan Didn’T Work. The Alphabet Has More Letter ! Stay Cool."));
        member_list.add(new HaptoData("Be Happy In Front Of People Who Don’T Like You ” It Kills Them “."));
        member_list.add(new HaptoData("Whenever I Find The Key To Success , Someone Changes The Lock."));
        member_list.add(new HaptoData("I Dont Have Attitude Problem. I Have Attitude & Problem Is Yours."));
        member_list.add(new HaptoData("Your Attitude Is Like A Price Tag, It Shows How Valuable You Are."));
        member_list.add(new HaptoData("Trying To Succeed ==> Then Started With Deleting Whatsapp Account."));
        member_list.add(new HaptoData("I’M Jealous Of My Parents. I;Ll Never Have A Kid As Cool As Theirs."));
        member_list.add(new HaptoData("Fake People Have An Images To Maintain. Real People Just Don’t Care."));
        member_list.add(new HaptoData("I Am Always Right, Once I Thought That I Am Wrong, But I Was Wrong."));
        member_list.add(new HaptoData("Sometimes All You Need Is Love. Lol, Just Kidding, You Need Money."));
        member_list.add(new HaptoData("The Only Crush Left In Life, After Getting Married Is ‘Candy Crush’"));
        member_list.add(new HaptoData("Work So Hard That One Day Your Signature Will Be Called An Autograph."));
    }

    private void attitude() {

        member_list = new ArrayList<HaptoData>();
        member_list.add(new HaptoData("I'm not changed it’s just I grew up and you should try too."));
        member_list.add(new HaptoData("I never insult people I only tell them what they are."));
        member_list.add(new HaptoData("If you think I am BAD than you’re wrong, I'm the worst."));
        member_list.add(new HaptoData("The biggest slap to your enemies is your success."));
        member_list.add(new HaptoData("I always arrive late at office but I make it by leaving early."));
        member_list.add(new HaptoData("I’m sorry my fault. I forgot you’re an Idiot."));
        member_list.add(new HaptoData("I don’t have a bad handwriting, I have my own FONT."));
        member_list.add(new HaptoData("My attitude based on how you treat me."));
        member_list.add(new HaptoData("Hakuna Matata!!! – The great motto to live life..."));
        member_list.add(new HaptoData("Yeah You - The one reading my status, Get Lost!"));
        member_list.add(new HaptoData("When a bird hits your window have you ever wondered if God is playing angry birds with you?"));
        member_list.add(new HaptoData("I know the voices in my head aren’t real but sometimes their ideas are just absolutely awesome!"));
        member_list.add(new HaptoData("I loved a girl and she broke my heart. Now every piece of my heart love different girls. People called it flirt that's not fair…"));
        member_list.add(new HaptoData("Dear Mario, I wasted my childhood trying to save your girlfriend. Now, you help me to save mine."));
        member_list.add(new HaptoData("Me and my wife live happily for 25 years and then we met…"));
        member_list.add(new HaptoData("Childhood is like being drunk, everyone remembers what you did, except you."));
        member_list.add(new HaptoData("I’m poor. I can’t pay attention in class room."));
        member_list.add(new HaptoData("When I'm good I'm best , when I'm bad I'm worst."));
        member_list.add(new HaptoData("I’m cool but global warming made me hot."));
        member_list.add(new HaptoData("Excuse me. I found something under my shoes oh its your Attitude."));
        member_list.add(new HaptoData("If people are trying to bring you ‘Down’, It only means that you are ‘Above them’."));
        member_list.add(new HaptoData("Please don’t get confused between my personality & my attitude."));
        member_list.add(new HaptoData("My personality is who I am & my attitude depends on who you are!"));
        member_list.add(new HaptoData("I'm Not Special , I'm Just Limited Edition."));
        member_list.add(new HaptoData("Everything that kills me makes me feel alive."));
        member_list.add(new HaptoData("I enjoy when people show Attitude to me because it shows that they need an Attitude to impress me!"));
        member_list.add(new HaptoData("Stop checking my status ! Go get a Life!"));
        member_list.add(new HaptoData("Coins always make sound but the currency notes are always silent! that’s why I’m always calm & silent."));
        member_list.add(new HaptoData("My “last seen at” was just to check your “last seen at”."));
        member_list.add(new HaptoData("Life is too short. Don't waste it removing pen drive safely."));
        member_list.add(new HaptoData("Life will give you exactly what you need, not what you want."));
        member_list.add(new HaptoData("I did lots of stupid things on social networking sites but atleast I never commented “Cute pic dear“ on girls profile picture."));
        member_list.add(new HaptoData("Your Whatsapp status say’s online …..If your online then why aren’t you texting me"));
        member_list.add(new HaptoData("I started out with nothing and i still have most of it."));
        member_list.add(new HaptoData("I was not busy to be online… I had just gave up on my life when I picked up this girls phone and saw my contact name as “Free Recharge”."));
        member_list.add(new HaptoData("I will marry the girl who look as pretty as in her Aadhaar card."));
        member_list.add(new HaptoData("They say we learn from our mistakes. So I'm making as many as possible! Soon I will be a genius."));
        member_list.add(new HaptoData("Sorry vegetarians we can’t pretend."));
        member_list.add(new HaptoData("Waiting for Wi-Fi network."));
        member_list.add(new HaptoData("I wish I had Google in my mind and antivirus in my heart."));
        member_list.add(new HaptoData("Life is too short. Don’t waste it reading my Whatsapp status..."));
        member_list.add(new HaptoData("Tried to loose weight… But it keeps finding me."));
        member_list.add(new HaptoData("I just saved a bunch of money on my car insurance by selling my car."));
        member_list.add(new HaptoData("I’m looking for a bank loan which can perform two things..give me a Loan and then leave me Alone."));
        member_list.add(new HaptoData("lazy People Fact #5812672793 You were too lazy to read that number."));
        member_list.add(new HaptoData("Sleep till you’re hungry... Eat till you’re sleepy."));
        member_list.add(new HaptoData("If your bad. Call me your Dad."));
        member_list.add(new HaptoData("If I was asked what a friend looks like, I would seat next to you and hold you tight because you define what true friendship really is."));
        member_list.add(new HaptoData("Friends are the family you choose."));
        member_list.add(new HaptoData("Good friends will share the umbrella. Best friends will steal it and yell: It’s Awesome, Now Run!"));
        member_list.add(new HaptoData("What is a Best friend? A single soul in two bodies."));
        member_list.add(new HaptoData("Friendship is born at that moment when one person says to another: ‘What! You too? I thought I was the only one."));
        member_list.add(new HaptoData("A friend is someone who knows all about you and still loves you."));
        member_list.add(new HaptoData("True friendship is sitting together in silence and feeling like it was the best conversation you've ever had."));
        member_list.add(new HaptoData("Friends are notes to life's great songs. A melody that carries you along."));
        member_list.add(new HaptoData(" A best friend is someone who tells you the truth even when you don't want to hear it."));
        member_list.add(new HaptoData("I don't have an attitude, I have standards for the people who are supposed to be my friends."));
        member_list.add(new HaptoData("It is better to live alone. There is no friendship with a fool."));
        member_list.add(new HaptoData("A true friend sees the first tear, catches the second an stops the third."));
        member_list.add(new HaptoData("A true friend reaches for your hand and touches your hear."));
        member_list.add(new HaptoData("My friends are the weirdest, most craziest people I know but I love them."));
        member_list.add(new HaptoData("World is full of smiles, whenever friends are with me."));
        member_list.add(new HaptoData("If friendship is your weakest point then your the strongest person in the world."));
        member_list.add(new HaptoData("Good friends are like starts. You don't always see them but you know they're always there."));
        member_list.add(new HaptoData("Fake friends believe in rumors. Real friends believe in you."));
        member_list.add(new HaptoData("Never forget who was there for you when no one else was."));

    }

    private void funny() {

        member_list = new ArrayList<HaptoData>();
        member_list.add(new HaptoData("I'm not lazy, I'm on energy saving mode."));
        member_list.add(new HaptoData("Hey there Whatsapp is using me."));
        member_list.add(new HaptoData("Girls use photoshop to look beautiful.. Boys use photoshop to show their creativity."));
        member_list.add(new HaptoData("You can never buy Love... But still you have to pay for it."));
        member_list.add(new HaptoData("Did anyone else notice the sound if you click the like button on my status?"));
        member_list.add(new HaptoData("I live in a world of fantasy, so keep your reality away from me!"));
        member_list.add(new HaptoData("My biggest concern in life is actually how my online friends can be informed of my death."));
        member_list.add(new HaptoData("Who needs television when there is so much drama on Facebook."));
        member_list.add(new HaptoData("Save water - Drink beer!"));
        member_list.add(new HaptoData("Dear Lord, there is a bug in your software... it's called Monday, please fix it."));
        member_list.add(new HaptoData("Always wear cute pajamas to bed you'll never know who you will meet in your dreams."));
        member_list.add(new HaptoData("God is really creative, I mean just look at me"));
        member_list.add(new HaptoData("Decided to burn lots of calories today so I set a fat kid on fire."));
        member_list.add(new HaptoData("When I'm on my death bed, I want my final words to be 'I left one million dollars in the...'"));
        member_list.add(new HaptoData("My father always told me, find a job you love and you'll never have to work a day in your life."));
        member_list.add(new HaptoData("Life is too short smile while you still have teeth..."));
        member_list.add(new HaptoData("My study period = 15 minutes. My break time = 3 hours."));
        member_list.add(new HaptoData("I'm jealous of my parents... I'll never have a kid as cool as theirs!"));
        member_list.add(new HaptoData("Here my dad comes on whatsapp... From now on my status would be '***no status***' or just a smiley..."));
        member_list.add(new HaptoData("Don't kiss behind the garden, Love is blind but the neighbors are not."));
        member_list.add(new HaptoData("Friends are forever, until they get in a relationship"));
        member_list.add(new HaptoData("C.L.A.S.S - Come late and start sleeping"));
        member_list.add(new HaptoData("People who exercise live longer, but what's the point when those extra years are spent at gym."));
        member_list.add(new HaptoData("Relationship Status: Looking for a FREE WiFi connection."));
        member_list.add(new HaptoData("It may look like I'm deep in thought, but 99% of the time I'm just thinking about what food to eat later.\n"));
        member_list.add(new HaptoData("When a newly married man looks happy, we know why. But when a ten-year married man looks happy, we wonder why."));
        member_list.add(new HaptoData("Sorry about those texts I sent you last night, my phone was drunk."));
        member_list.add(new HaptoData("We are WTF generation .... WhatsApp, Twitter and Facebook"));
        member_list.add(new HaptoData("Having a best friend with the same mental disorder is a blessing. LOL"));
        member_list.add(new HaptoData("This is the beginning of the sentence you just finished reading."));
        member_list.add(new HaptoData("WoW now I’m a graduate... Now thermometer is not the only thing that has degrees without brains."));
        member_list.add(new HaptoData("Me and my wife lived happily for 25 years and then we met…"));
        member_list.add(new HaptoData("Good Morning, let the stress begin..."));
        member_list.add(new HaptoData("Don’t settle for good. Demand Great!"));
        member_list.add(new HaptoData("Price is what you pay. Value is what you get."));
        member_list.add(new HaptoData("Eat - Sleep - Regret - Repeat."));
        member_list.add(new HaptoData("Sometimes i just wish i’ could fast forward the time to see if in the end it’s all worth it."));
        member_list.add(new HaptoData("We are all part of the ultimate statistic – ten out of ten die."));
        member_list.add(new HaptoData("Love is that state of mind when a karan johar film becomes bearable."));
        member_list.add(new HaptoData("Always remember you are UNIQUE - Just like everybody else."));
        member_list.add(new HaptoData("You don’t have to like me... I am not a facebook status."));
        member_list.add(new HaptoData("Life is too short. Don't waste it removing pen drive safely."));
        member_list.add(new HaptoData("Whatsapp status is loading..."));
        member_list.add(new HaptoData("Think about it...every time we look back at ourselves five years ago we think we were an idiot."));
        member_list.add(new HaptoData("Happiness is when 'Last seen at' changes to 'Online' and then to 'Typing...'"));
        member_list.add(new HaptoData("I Am Not Special, I Am Just Limited Edition!"));
        member_list.add(new HaptoData("Waiting for Wi-Fi Network..."));
        member_list.add(new HaptoData("One day, I’m gonna make the onions cry."));
        member_list.add(new HaptoData("Dear Math, please grow up and solve your own problems, I’m tired of solving them for you."));
        member_list.add(new HaptoData("We live in a society were pizza gets to your house before police"));
        member_list.add(new HaptoData("One wise guy invented mobile application Whatsapp and his wife added last seen feature..."));


    }

    private void motivational() {

        member_list = new ArrayList<HaptoData>();
        member_list.add(new HaptoData("Stop being afraid of what could go wrong and start being positive about what could go right."));
        member_list.add(new HaptoData("Great things never come from comfort zones."));
        member_list.add(new HaptoData("Life doesn’t give you what you want. It gives you what you work for."));
        member_list.add(new HaptoData("Age is a question of mind over matter. If you don’t mind, it doesn’t matter."));
        member_list.add(new HaptoData("Hope is the power that gives a person the confidence to step out and try…"));
        member_list.add(new HaptoData("It does not matter how many times you get knocked down, but how many times you get up."));
        member_list.add(new HaptoData("Tough times don’t last, but tough people do."));
        member_list.add(new HaptoData("Decision defines destiny..."));
        member_list.add(new HaptoData("All you need to change is will."));
        member_list.add(new HaptoData("Never, never, never, never give up."));
        member_list.add(new HaptoData("Do not give up, the beginning is always the hardest."));
        member_list.add(new HaptoData("You never fail until you stop trying."));
        member_list.add(new HaptoData("Whatever brings you down, will eventually make you stronger."));
        member_list.add(new HaptoData("The harder you fall, the higher you bounce."));
        member_list.add(new HaptoData("Whether you Think you can, or think you can’t you’re always right."));
        member_list.add(new HaptoData("The secret of success is to know something nobody else knows."));
        member_list.add(new HaptoData("Everyone has a will to win but very few have the will to prepare to win."));
        member_list.add(new HaptoData("Success is the sum of small efforts, repeated day in and day out."));
        member_list.add(new HaptoData("If you want your life to be meaningful go out and do something about it."));
        member_list.add(new HaptoData("Motivation is what gets you started. Habit is what keeps you going."));
        member_list.add(new HaptoData("SUCCESS belongs only to those who are willing to work harder than anyone else."));
        member_list.add(new HaptoData("If you believe in yourself, things are possible."));
        member_list.add(new HaptoData("If you don’t go after what you want, you will never have it."));
        member_list.add(new HaptoData("Even if you’re on the right track, you’ll get run over if you just sit there."));
        member_list.add(new HaptoData("Pearls don’t lie on the sea shore. If you want one, you must dive for it."));
        member_list.add(new HaptoData("Great minds discuss ideas; average minds discuss events; small minds discuss people."));
        member_list.add(new HaptoData("Challenge yourself with something you know you could never do, and what you’ll find is that you can overcome anything."));
        member_list.add(new HaptoData("It is never too late to be what you might have been."));
        member_list.add(new HaptoData("All our dreams can come true, if we have the courage to pursue them."));
        member_list.add(new HaptoData("The best way to predict the future is to invent it."));
        member_list.add(new HaptoData("If you cannot do great things, do small things in a great way."));
        member_list.add(new HaptoData("If opportunity doesn’t knock, build a door."));
        member_list.add(new HaptoData("An obstacle is often a stepping stone."));
        member_list.add(new HaptoData("Failure is the condiment that gives success its flavor."));
        member_list.add(new HaptoData("Luck is a dividend of sweat. The more you sweat, the luckier you get."));
        member_list.add(new HaptoData("Thinking is the hardest work there is, which is probably the reason so few engage in it."));
        member_list.add(new HaptoData("If I had asked people what they wanted, they would have said ‘faster horses.’"));
        member_list.add(new HaptoData("I cannot discover that anyone knows enough to say what is and what is definitely not possible."));
        member_list.add(new HaptoData("There is no man living who isn’t capable of doing more than he thinks he can do."));
        member_list.add(new HaptoData("A business absolutely devoted to service will have only one worry about profits. They will be embarrassingly large."));
        member_list.add(new HaptoData("Quality means doing it right when no one is looking."));
        member_list.add(new HaptoData("The only real mistake is the one from which we learn nothing."));
        member_list.add(new HaptoData("There are two primary choices in life: to accept conditions as they exist, or accept the responsibility for changing them."));
        member_list.add(new HaptoData("The man who has confidence in himself gains the confidence of others."));
        member_list.add(new HaptoData("What counts is not necessarily the size of the dog in the fight–it’s the size of the fight in the dog."));
        member_list.add(new HaptoData("What counts is not necessarily the size of the dog in the fight–it’s the size of the fight in the dog."));
        member_list.add(new HaptoData("Many of life’s failures are experienced by people who did not realize how close they were to success when they gave up."));
        member_list.add(new HaptoData("I am always doing that which I cannot do, in order that I may learn how to do it."));
        member_list.add(new HaptoData("I will not follow where the path may lead, but I will go where there is no path, and I will leave a trail."));
        member_list.add(new HaptoData("You must be the change that you wish to see in the world."));
        member_list.add(new HaptoData("I know for sure that what we dwell on is who we become."));
        member_list.add(new HaptoData("Little minds are tamed and subdued by misfortune; but great minds rise above them."));
        member_list.add(new HaptoData("Remember that happiness is a way of travel, not a destination."));
        member_list.add(new HaptoData("Perfection is not attainable, but if we chase perfection we can catch excellence."));
        member_list.add(new HaptoData("In matters of style, swim with the current; in matters of principle, stand like a rock."));
        member_list.add(new HaptoData("It is the mark of an educated mind to be able to entertain a thought without accepting it."));
        member_list.add(new HaptoData("Your Most Unhappy Customer are Your Greatest Source of Learning"));
        member_list.add(new HaptoData("Success is a lousy teacher. It seduces smart people into thinking they can’t lose."));

    }

    private void angry() {

        member_list = new ArrayList<HaptoData>();
        member_list.add(new HaptoData("We are not always right but it doesn't mean that I am always wrong."));
        member_list.add(new HaptoData("Some people should have two Facebook account for each face"));
        member_list.add(new HaptoData("Don't tell me how to live I do it my ways"));
        member_list.add(new HaptoData("I can't blame me if I got an awesome personality and people get angry on it"));
        member_list.add(new HaptoData("Thanks to people helping me burn calorie with there lame annoying habits"));
        member_list.add(new HaptoData("A state of mind when you will be tensed for someone else's faults"));
        member_list.add(new HaptoData(" By God, there’s a lot to make U angry."));
        member_list.add(new HaptoData("Sometimes I am just not in the mood to talk."));
        member_list.add(new HaptoData("If I delete your number, u’re basically deleted from my life."));
        member_list.add(new HaptoData("I may look calm, but in my head I’ve killed u about 5 times."));
        member_list.add(new HaptoData(" Beware, I am not in my greatest mood today."));
        member_list.add(new HaptoData("Nobody makes u angry, you decide to use anger as a response."));
        member_list.add(new HaptoData("Sometimes I’m not angry, I am hurt and there’s a big difference."));
        member_list.add(new HaptoData("Anger is short lived madness."));
        member_list.add(new HaptoData("If u want to hear the whole truth about yourself, make your neighbor angry."));
        member_list.add(new HaptoData("When u stopped believing in me, I did too."));
        member_list.add(new HaptoData("An angry man opens his mouth & shuts his eyes."));
        member_list.add(new HaptoData("Don’t try to please other people if in the end, u know it wont work"));
        member_list.add(new HaptoData("Do not teach yur children never to be angry, teach them how to be angry."));
        member_list.add(new HaptoData("Depression is merely anger without enthusiasm."));
        member_list.add(new HaptoData("Anger is never without a reason, Butt seldom with a good one."));
        member_list.add(new HaptoData("I will not delete u or block you. I am keeping you there so u will be able to see how happy I’m without u.."));
        member_list.add(new HaptoData("If u are patient in one moment of anger, you will escape a hundred days of sorrow."));
        member_list.add(new HaptoData("There’s No Excuse!! For Cheating In A Relationship."));
        member_list.add(new HaptoData("Some Things Can Never Be Forgotten & Nor Forgiven."));
        member_list.add(new HaptoData("I Don’T Regret My Past.!! I Just Regret The Time I Have Wasted With The Wrong People."));
        member_list.add(new HaptoData("The best remedy for a short temper is a long walk."));
        member_list.add(new HaptoData("I Don’T Need To Manage My Anger, Peple Need To Manage Their Stupidity."));
        member_list.add(new HaptoData("Some people never realise the emotional & mental damage they do to others."));
        member_list.add(new HaptoData("Anger makes dull men witty, but it keeps them poor."));
        member_list.add(new HaptoData("If u like me then chat with me, if not then raise your standard."));
        member_list.add(new HaptoData("Always remember pain makes people change, So don’t hurt them when u don’t want them to change."));
        member_list.add(new HaptoData("Life is simple, people are complicated…"));
        member_list.add(new HaptoData("Fastest horse can not catch a word spoken in anger."));
        member_list.add(new HaptoData("When U are angry, Ur text speed increases by a ridiculous amount.!!"));
        member_list.add(new HaptoData("Forget what hurt u, but never what it taught you. !!"));
        member_list.add(new HaptoData("It’s not my fault that I fell for u, u tripped me!"));
        member_list.add(new HaptoData("Anger is a feeling that makes Ur mouth work faster than Ur mind"));
        member_list.add(new HaptoData("Tears R the last gift of TRUE LOVE…"));
        member_list.add(new HaptoData("I hate u Because I Love u, I Know You Love Me But your ego stopped you."));
        member_list.add(new HaptoData("Getting angry does not solve anything."));
        member_list.add(new HaptoData(" If U want to hear the whole truth about yourself, then make Ur neighbor angry."));
        member_list.add(new HaptoData(" Everybody want to go to heaven, but nobody wants to die"));
        member_list.add(new HaptoData("Unless I am sitting on your face My Weight is none of your Business!"));
        member_list.add(new HaptoData("Know your limits or else i will cross mine."));
        member_list.add(new HaptoData("Where there is anger.., there is always pain underneath."));
        member_list.add(new HaptoData("Meaningful silence is better than meaningless wordss.."));
        member_list.add(new HaptoData("I hate the moment when suddenly my Anger turns into my tears."));
        member_list.add(new HaptoData("I wants to commit the murder I was imprisoned for..."));
        member_list.add(new HaptoData("Anger is fear in disguise…!!"));
        member_list.add(new HaptoData("It Is Clear That Yu Have Lost Your,Importance From Their Life…!!"));
        member_list.add(new HaptoData("Sadness is the result of unhappy thought."));
        member_list.add(new HaptoData("Xcuse me, I found something under my shoes. Oh its your Attitude."));
        member_list.add(new HaptoData("Anger is a temporary madness."));
        member_list.add(new HaptoData("Don’t disturb me plz, I am disturbed enough already."));
        member_list.add(new HaptoData("Silence is the best way to react with angry man."));
        member_list.add(new HaptoData("Don’t get mad, smile & creep them out instead."));
        member_list.add(new HaptoData("Never do anything when U are in a temper, for U will do everything wrong."));
        member_list.add(new HaptoData("When U stopped believing in me, I did too."));
        member_list.add(new HaptoData("For every Minute U are angry U loose sixty seconds of happiness."));
        member_list.add(new HaptoData("I’ll Surely listen to your opinion but it will not affect my stand! Get Lost."));
        member_list.add(new HaptoData("There Is No Excuse For Cheating In A Relationship."));
        member_list.add(new HaptoData("If u take something from me be damn sure I’m gonna take something from you…."));
        member_list.add(new HaptoData("I Don’T Regret My Past. I Just Regret The Time I Have Wasted With The Wrong People"));
        member_list.add(new HaptoData("What goes around comes around. That’s what people say. So all the pain you caused me will come back to you someday."));
        member_list.add(new HaptoData("Sometimes I am just not in the mood to talk."));
        member_list.add(new HaptoData("Anger is one letter short of danger."));
        member_list.add(new HaptoData("Anger is never without a reason, but seldom with a good one."));
        member_list.add(new HaptoData("Remember I talk to myself because I like dealing with a better class of people."));
        member_list.add(new HaptoData("Stop being a fake China product!"));
        member_list.add(new HaptoData("My silence doesn’t mean that I quit. It simply means that I don’t want to argue with people who just don’t want to understand!"));
        member_list.add(new HaptoData("Just because I’m being quiet, that doesn’t mean I’m mad. Sometimes I’m just not in the mood to talk."));
        member_list.add(new HaptoData("Some people never realize the emotional and mental damage they do to others."));
        member_list.add(new HaptoData("I’m not arguing, I’m just explaining why I’m right."));
        member_list.add(new HaptoData(" may look calm, but in my head, I’ve killed you about 5 times."));
        member_list.add(new HaptoData("I hate u Because I Love you, I Know You Love Me But your ego stopped you from Loving me."));
        member_list.add(new HaptoData("Sometimes it’s not the people who change, it’s the mask that falls off…"));
        member_list.add(new HaptoData("No need for revenge. Just sit back and wait. Those who hurt you will eventually screw up and if you are lucky, you will get to watch."));
        member_list.add(new HaptoData("Never forget what someone says to you when they are angry because that’s when the truth comes out."));
        member_list.add(new HaptoData("If I Delete Your Number, It Means that You’Re Basically Deleted From My Entire Life."));
        member_list.add(new HaptoData("Some people need to open their small minds instead of their big mouths."));
        member_list.add(new HaptoData("The more I get to know guys, the more I like Animals."));
        member_list.add(new HaptoData("Life is a Bitch until you are rich."));
        member_list.add(new HaptoData("He said the spark between us was gone. So I tasered him. I’ll ask him again when he wakes up."));
        member_list.add(new HaptoData("Sometimes my one middle finger isn’t enough to let someone know how you feel. That’s why you have two hands."));
        member_list.add(new HaptoData("Forget what hurt you, but never what it taught you!!!!"));
        member_list.add(new HaptoData("People change, things go wrong, shit happens, but life goes on."));
        member_list.add(new HaptoData("Don’t disturb me, I am disturbed enough already."));
        member_list.add(new HaptoData("Sometimes I’m not angry, I’m hurt and there’s a big difference."));
        member_list.add(new HaptoData("My Life, My Choices, My Problems, My Mistakes, My Lessons. Don’t even try to Interfere with my Problem."));
        member_list.add(new HaptoData("Anger repressed can poison a relationship as surely as the cruelest words."));
        member_list.add(new HaptoData("I Text You Because I Want To Have A Conversation With You. Not To Get One Word Answers."));
        member_list.add(new HaptoData("I’m not flirting. I’m just being extra nice to someone who is extra attractive."));

    }

    private void breakUp() {

        member_list = new ArrayList<HaptoData>();
        member_list.add(new HaptoData("My silence is just another word for my PAIN."));
        member_list.add(new HaptoData("I'm leaving for our own Good, Now I'm happy, how about you?"));
        member_list.add(new HaptoData("People cry not because they are weak, It's because they've been strong for too long."));
        member_list.add(new HaptoData("I fall too fast, crush too hard, forgive too easy, and care too much."));
        member_list.add(new HaptoData("I hope you'll realize how much you're hurting me someday."));
        member_list.add(new HaptoData("If you give up on me, I'm going to give up on me too."));
        member_list.add(new HaptoData("A beautiful girl with gorgeous EYES, a hidden world of HURT & LIES."));
        member_list.add(new HaptoData("Make the most beautiful Mistakes, mine is you."));
        member_list.add(new HaptoData("I'm slowly giving up."));
        member_list.add(new HaptoData("I'm not afraid to fall in LOVE, I'm afraid to fall for a wrong person again."));
        member_list.add(new HaptoData("You're the only exception."));
        member_list.add(new HaptoData("BEING IGNORED, worst feeling ever."));
        member_list.add(new HaptoData("I hate missing someone and not being able to do anything about it."));
        member_list.add(new HaptoData(" But the all didn't see the little bit of sadness in me."));
        member_list.add(new HaptoData("Out of all lies you have told... was my favorite."));
        member_list.add(new HaptoData("Life is short, there is no time to leave important words UNSAID."));
        member_list.add(new HaptoData("Never put your happiness in someone else's hands."));
        member_list.add(new HaptoData("It's never the tear that measure the PAIN, sometimes its the SMILE we fake."));
        member_list.add(new HaptoData("I always found the right one on wrong time."));
        member_list.add(new HaptoData("Silence is the most powerful SCREAM."));
        member_list.add(new HaptoData("I miss how you always MADE time for me."));
        member_list.add(new HaptoData("Never give up on someone you cant spend a day not thinking about."));
        member_list.add(new HaptoData("Please BURN my sad memories."));
        member_list.add(new HaptoData("SLEEP away the sadness of today."));
        member_list.add(new HaptoData("Loneliness doesn't KILL, but sometimes I wish it DID."));
        member_list.add(new HaptoData("I want you to be FREE, but I can watch you SOAR away from me."));
        member_list.add(new HaptoData("The CURE of anything is salt WATER - Sweat, Tear, or the SEA."));
        member_list.add(new HaptoData("We can do no great things, only small things with great love."));
        member_list.add(new HaptoData("I just want to fall asleep until I don't miss you anymore."));
        member_list.add(new HaptoData("A relationship is only made for two… but some just forget how to count."));
        member_list.add(new HaptoData("The same person who said the sweetest things to me also said some of the meanest things I've ever heard."));
        member_list.add(new HaptoData("I hope we meet again."));
        member_list.add(new HaptoData("Nothing last forever."));
        member_list.add(new HaptoData("Sometimes, you have to smile to hold back the tears."));
        member_list.add(new HaptoData("Just because I let you go, doesn’t mean I wanted to."));
        member_list.add(new HaptoData("If it’s not a happy ending then it’s not the ending at all."));
        member_list.add(new HaptoData("Love is beautiful mistake of my life."));
        member_list.add(new HaptoData("Love is blind, Be careful..."));
        member_list.add(new HaptoData("Love is my favorite mistake..."));
        member_list.add(new HaptoData("If you can’t save the relationship, at least save your pride."));
        member_list.add(new HaptoData("I wish you weren’t in my dreams."));
        member_list.add(new HaptoData("They say when you are missing someone that they are probably feeling the same, but I don't think it's possible for you to miss me as much as I'm missing you right now..."));
        member_list.add(new HaptoData("Isn’t it sad that you are hurt so much that finally you can say I’m used to it"));
        member_list.add(new HaptoData("The most painful memory I have is of when I walked away and you let me leave."));
        member_list.add(new HaptoData("Tonight I can write the saddest lines I loved her, and sometimes she loved me too."));
        member_list.add(new HaptoData(" I don’t miss losing my lover. I miss losing my best friend. And that loss is irreplaceable."));
        member_list.add(new HaptoData("Those 3 years of our togetherness, the commitment, everything feels like a waste of time today."));
        member_list.add(new HaptoData("Does true love exist? or it is a fantasy of having a good-looking boyfriend?"));
        member_list.add(new HaptoData("Stop walking the extra mile for someone who won’t cross the street for you."));
        member_list.add(new HaptoData("I'm disappointed you cheated on me with her! I expected you to go for something better than me."));
        member_list.add(new HaptoData("Broken up! Deleted past conversation. Cleared the pictures. Finally breathing! and ready to move on! So, where’s the party tonight?"));
        member_list.add(new HaptoData("Heard sad songs. Had ice cream. Burnt old photos. Danced 2 hours straight. Now, need a hug from a friend. Any volunteers?"));
        member_list.add(new HaptoData("You leaving me for someone rich defines YOU, not me!"));
        member_list.add(new HaptoData("I treated you ‘Queen of my heart’, you treated me as ‘Donkey Cart’"));
        member_list.add(new HaptoData("Pain is the only thing that’s telling me I’m still alive."));
        member_list.add(new HaptoData("When I close my eyes I see you, when I open my eyes I miss you."));
        member_list.add(new HaptoData("I hate the moment when suddenly my anger turns into tears."));
        member_list.add(new HaptoData("During the day I keep myself busy and sometimes time passes. But at night, I really miss you."));
        member_list.add(new HaptoData("Sometimes life doesn't want to give you something you want, not because you don't deserve it, but because you deserve more."));
        member_list.add(new HaptoData("I'm not afraid to fall in love. I'm afraid to fall for the wrong person again."));
        member_list.add(new HaptoData("Smile. It will make him so jealous to see you're happy without him."));
        member_list.add(new HaptoData("When I see you smile and know that it is not for me, that is when I will miss you the most"));
        member_list.add(new HaptoData("Sometimes when I say: I'm okay. I want someone to look me in the eyes, hug me tight, and say: I know you're not."));
        member_list.add(new HaptoData("Sometimes It’s better to be alone… No one can hurt you."));
        member_list.add(new HaptoData("Every time I start trusting someone, they show me why I shouldn’t."));
        member_list.add(new HaptoData("Sometimes the people who are thousands of miles away from you can make you feel better than the people who are right beside you."));
        member_list.add(new HaptoData("Dear Hear, please stop getting involved in everything. Your job is to pump blood that's it."));
        member_list.add(new HaptoData("The worst kind of pain is when you're smiling to stop the tears from falling."));
        member_list.add(new HaptoData("Don't forgive, dump me!"));
        member_list.add(new HaptoData("Sorry, I just never realized how ugly you are..."));
        member_list.add(new HaptoData("There's been a death in the family. My hamster. Sorry!"));
        member_list.add(new HaptoData("Are you into horses and stuff? I know I am... I also like sheep. They give you that warm feeling. Hello? Are you still there?"));

    }

    private void missYou() {

        member_list = new ArrayList<HaptoData>();
        member_list.add(new HaptoData("I’M Officially Missing You !"));
        member_list.add(new HaptoData("I Feel Like An Idiot For Missing You."));
        member_list.add(new HaptoData("Its Not Enough To Say That I Miss You."));
        member_list.add(new HaptoData("I Will Stop Missing You When I Am With You."));
        member_list.add(new HaptoData("I Miss You Like A Squirrel Misses His Nuts."));
        member_list.add(new HaptoData("I Hate To Admit It But I’Ll Always Miss You."));
        member_list.add(new HaptoData("You Make Me Miss You Like There’S No Tomorrow."));
        member_list.add(new HaptoData("After All This Time, I Still Miss You, Everyday."));
        member_list.add(new HaptoData("I Miss The Sound Of Your Voice. I Miss You Baby."));
        member_list.add(new HaptoData("I Wish I Were Kissing You Instead Of Missing You."));
        member_list.add(new HaptoData("I Try Not To Miss You. But In The End I Still Do."));
        member_list.add(new HaptoData("If You Think Missing Me Is Hard. Try Missing You."));
        member_list.add(new HaptoData("Missing Someone Is The Worst Feeling In The World."));
        member_list.add(new HaptoData("I Miss You. I Don’T Know What Else There Is To Say."));
        member_list.add(new HaptoData("I Just Wish I Am Kissing Her Instead Of Missing Her."));
        member_list.add(new HaptoData("I Miss The Time When I Actually Meant Something To You."));
        member_list.add(new HaptoData("In A Sea Of People, My Eyes Will Always Search For You."));
        member_list.add(new HaptoData("I Wish We Could Go Back To How We Use To Be. I Miss That."));
        member_list.add(new HaptoData("I’M Tired Of Missing You. I Just Want You Here By My Side."));
        member_list.add(new HaptoData("I Did Three Things Today : Miss You, Miss You And Miss You."));
        member_list.add(new HaptoData("Time Seem To Crawl When You Miss The One You Love. I Miss You."));
        member_list.add(new HaptoData("When I Miss You, It Seems Every Song I Listen To Is About You."));
        member_list.add(new HaptoData("You May Be Out Of My Sight But Never Out Of My Mind. I Miss You."));
        member_list.add(new HaptoData("The Worst Part Of Missing You Is Not Knowing If You Miss Me Too."));
        member_list.add(new HaptoData(" Come And Kiss This Pain Away. I Am Alone Without You. I Miss You."));
        member_list.add(new HaptoData("There’S Not A Single Moment In The Whole Day, When I Don’T Miss You."));
        member_list.add(new HaptoData("When I Close My Eyes, I See You. When I Open My My Eyes, I Miss You."));
        member_list.add(new HaptoData("If You Start To Mess Me, Remember, I Didn’t Walkaway. You Let Me Go."));
        member_list.add(new HaptoData("I Wish That You Were Here Or I Were There Or We Were Together Anywhere."));
        member_list.add(new HaptoData("All I Can Do Every Time I Miss You Is To Stare At Your Pictures & Smile."));
        member_list.add(new HaptoData("Sometimes When One Person Is Missing, The Whole World Seems Depopulated."));
        member_list.add(new HaptoData("When I Miss You, I Re-Read Our Old Conversations & Smile Like And Idoit."));
        member_list.add(new HaptoData("Missing Someone Is Your Heart’S Way Of Reminding You That You Love Them."));
        member_list.add(new HaptoData("Even If I Spend The Whole Day With You. I Miss You The Second You Leave."));
        member_list.add(new HaptoData("He’S Not The Only Guy In The Universe, But He’S The Only One That Matters."));
        member_list.add(new HaptoData("I Go To Your Page Because I Miss You, Then Regret It Because Of What I See."));
        member_list.add(new HaptoData("Life Is So Short, So Fast. The Lone Hours We Ought To Be Together, You And I."));
        member_list.add(new HaptoData("I Really Miss You But Probably Not As Much As You Miss Me, I’M Pretty Awesome."));
        member_list.add(new HaptoData("If You Can’T Get Someone Out Of Your Head, May Be They Are Supposed To Be There."));
        member_list.add(new HaptoData("I Miss You Dearly My Heart Aches, My Head Is Lost, I Really Miss You. I Love You."));
        member_list.add(new HaptoData("When Your Mood Is Not Good Without Any Reason, You Are Definitely Missing Someone."));
        member_list.add(new HaptoData("I Try Not To Miss You. I Try To Let Fo. But In The End. You’Re Always On My Mind."));
        member_list.add(new HaptoData("I Keep Myself Busy With Things To Do, But Everytime I Pause, I Still Think Of You."));
        member_list.add(new HaptoData("Sometimes It’S Not About Missing Someone. It’S Wondering If They Arr Missing You."));
        member_list.add(new HaptoData("You May Not Be Here With Me But Thoughts Of You Are Always In My Heart. I Miss You."));
        member_list.add(new HaptoData("I Saw You, I Wanted You, Got You, I Liked You, I Loved You, I Lost You, I Miss You."));
        member_list.add(new HaptoData("One Day I Caught Myself Smiling For No Reason, Then I Realized I Was Thinking Of You."));
        member_list.add(new HaptoData("I Miss You More Than Ever ! I Don’T Know Why When You’Re The One Who Broke My Heart."));
        member_list.add(new HaptoData("Within You. I Lose Myself….Without You….I Find Myself….Wanting To Be Lost Again."));
        member_list.add(new HaptoData("I Just Wondered How You Are And If You Miss Me At All….Because I Miss You. A Lot !!!"));
        member_list.add(new HaptoData("I Planned To Say A Lot Of Things To You, But In The End All I Could Muster Up Was. I Miss You."));
        member_list.add(new HaptoData("I’Ll Miss You Until You Come Back But I Hope You’Ll Make Up For It By Getting Me Awesome Gifts."));
        member_list.add(new HaptoData("I Want To Say. I Miss You. But It Wouldn’T Change Anything So I’Ll Just Keep Pretending I Don’T."));
        member_list.add(new HaptoData("I Miss You. No, Let Me Correct That, I Miss The Old You. I Miss The Old You That Cared About Me."));
        member_list.add(new HaptoData("I Love You & I Miss You So Much ! You Will Always Be In My Heart, In My Thoughts & In My Prayers."));
        member_list.add(new HaptoData("I Am Waiting And Hoping….And Wishing For The Time, When We Can Be Together Again. Missing You A Lot."));
        member_list.add(new HaptoData("I Planned To Say All These Terrible Things To You, But In The End, I Just Want To Tell You, I Miss You."));
        member_list.add(new HaptoData("I Wanna Write ” I Miss You ” On A Rock And Throw At Your Face So You Know How Much It Hurts To Miss You."));
        member_list.add(new HaptoData("I Miss You As Soon As I Wake Up. I Miss You When I’M About To Sleep. I Wish You’Re Always Here Next To Me."));
        member_list.add(new HaptoData("I Miss You A Lot Baby, But Don’T Worry. I’Ll Wait No Matter How Long It Takes For You To Make Up Your Mind."));
        member_list.add(new HaptoData("I Miss You A Little, I Guess You Could Say, A Little Too Much, A Little Too Often, And A Little More Each Day."));
        member_list.add(new HaptoData("Missing Someone Is A Part Of Loving Them. If You’Re Never Apart, You’Ll Never Really Know How Strong Your Love Is."));
        member_list.add(new HaptoData("I Used To Miss You So Much, But I Never Felt Like You Really Missed Me Back & So I Guess I Just Stopped Missing You."));
        member_list.add(new HaptoData("Whenever I Start Feeling Sad, Because I Miss You, I Remind Myself How Lucky I Am To Have Someone So Special To Miss."));
        member_list.add(new HaptoData("When I Tell You That I’Ll Miss You, It Doesn’T Mean I’Ll Never Get Over You. It Just Means I Wish I Didn’T Have To."));
        member_list.add(new HaptoData("For Everything You Have Missed, You Have Gained Something Else, And For Everything You Gain, You Lose Something Else."));
        member_list.add(new HaptoData("Whenever I Miss You, I Close My Eyes & Go Back In Memory Lane & Live Those Moments Again .When It Was Just…You & Me."));
        member_list.add(new HaptoData("I Planned To Tell You All The Bad Things Why I Am Mad At You….But In The End, U Just Want To Tell You. I Missed You."));
        member_list.add(new HaptoData("I Admit, I Really Miss How Things Used To Be. But I Can Also Admit, That I’Ve Accepted The Fact That Things Have Changed."));

    }

    private void gymFitness() {

        member_list = new ArrayList<HaptoData>();
        member_list.add(new HaptoData("Achieving gym Goals, feeling the difference, falling in love everyday with myself."));
        member_list.add(new HaptoData("I can.. I will.. End of story!"));
        member_list.add(new HaptoData("When it starts to hurt, thats when the set starts."));
        member_list.add(new HaptoData("With great size comes great responsibility"));
        member_list.add(new HaptoData("I'm not here to talk."));
        member_list.add(new HaptoData("Squat till you puke"));
        member_list.add(new HaptoData("Doubt me, hate me, you're the inspiration I need."));
        member_list.add(new HaptoData("Strength Within, Pride Throughout"));
        member_list.add(new HaptoData("Hard work beats talent when talent doesn't work hard."));
        member_list.add(new HaptoData("Winners Train, Losers Complain."));
        member_list.add(new HaptoData("A winner never whines."));
        member_list.add(new HaptoData("You don't demand respect, you earn it."));
        member_list.add(new HaptoData("Good is not enough if better is possible."));
        member_list.add(new HaptoData("If the bar ain't bending you're just pretending."));
        member_list.add(new HaptoData("Character is who you are when no one's watching."));
        member_list.add(new HaptoData("Get ripped, get laid."));
        member_list.add(new HaptoData("Pain is weakness leaving the body."));
        member_list.add(new HaptoData("Eat clean. Train Mean. Get Lean."));
        member_list.add(new HaptoData("Go the extra mile. It's never crowded."));
        member_list.add(new HaptoData("Stop rewarding yourself with food. You are not a dog."));
        member_list.add(new HaptoData("Remember the girl who gave up? No one else does either."));
        member_list.add(new HaptoData("Learn to love the burn."));
        member_list.add(new HaptoData("Do it for the after picture."));
        member_list.add(new HaptoData("Work hard now, selfie later."));
        member_list.add(new HaptoData("Being defeated is often a temporary condition. Giving up is what makes it permanent."));
        member_list.add(new HaptoData("Failure is only a temporary change in direction to set you straight for your next success."));
        member_list.add(new HaptoData("If you fail to prepare, you prepare to fail"));
        member_list.add(new HaptoData("The worst thing you can be is average."));
        member_list.add(new HaptoData("Go hard or go home."));
        member_list.add(new HaptoData("EAT BIG, LIFT BIG, GET BIG!"));
        member_list.add(new HaptoData("The only time Success comes before Work is in the dictionary"));
        member_list.add(new HaptoData("I had the goal to be the best from day one."));
        member_list.add(new HaptoData("No pain, No gain!"));
        member_list.add(new HaptoData("Build your body, build your character"));
        member_list.add(new HaptoData("I do it because I can, I can because I want to, I want to because you said I couldn't."));
        member_list.add(new HaptoData("I'm not on steroids, but thanks for asking.."));
        member_list.add(new HaptoData("Men shouldn't hide weakness, they should kill it."));
        member_list.add(new HaptoData("The pain of today is the victory of tomorrow."));
        member_list.add(new HaptoData("If your out of breath, dizzy, feel like vomiting, can't remember your name, you are on the right road."));
        member_list.add(new HaptoData("Of course its heavy, thats why they call it weight."));
        member_list.add(new HaptoData("Squat! Because somewhere there's a girl warming up with your max."));
        member_list.add(new HaptoData("Cheat on your girlfriends, not on your workouts."));
        member_list.add(new HaptoData("A pint of sweat will save a gallon of blood."));
        member_list.add(new HaptoData("Second place is just a spot for the first looser."));
        member_list.add(new HaptoData("Never say the skys the limit when there are footprints on the moon."));
        member_list.add(new HaptoData("Life's too short to be small"));
        member_list.add(new HaptoData("Be proud, but never satisfied."));
        member_list.add(new HaptoData("Some people want it to happen, some wish it would happen, others make it happen."));
        member_list.add(new HaptoData("Only you get out, what you put in"));
        member_list.add(new HaptoData("If you dont live for something you'll die for nothing"));
        member_list.add(new HaptoData("You must do what others don't, to achieve what others won't"));
        member_list.add(new HaptoData("Yeah, I had a girlfriend once, but she couldn't spot me, so what was the point?"));
        member_list.add(new HaptoData("Obsession is what lazy people call dedication. "));
        member_list.add(new HaptoData("The worst thing I can be is the same as everybody else. I hate that."));
        member_list.add(new HaptoData("Just think about how you wanna look, just think about how you wanna look. Ok, up with it!"));
        member_list.add(new HaptoData("STAY WEAK. I needed those plates anyway."));
        member_list.add(new HaptoData("I got 99 problems but a BENCH ain't one."));
        member_list.add(new HaptoData("When the going gets tough the tough gets going"));
        member_list.add(new HaptoData("If you're not first, you're last"));
        member_list.add(new HaptoData("You cant flex fat so shut up and lift."));
        member_list.add(new HaptoData("Train hard, so they dig deeper than 6 feet into the ground."));
        member_list.add(new HaptoData("You want results, then train like it"));
        member_list.add(new HaptoData("Light days? Whats that? .. Some kind of tampon?"));
        member_list.add(new HaptoData("Fall down seven times, get up eight."));
        member_list.add(new HaptoData("When my body 'shouts' STOP, my mind 'screams' NEVER ."));
        member_list.add(new HaptoData("If you always do what you have always done, you will always get what you have always got."));
        member_list.add(new HaptoData("The best way to predict your future is to create it."));
        member_list.add(new HaptoData("You don't drown by falling in the water; you drown by staying there."));
        member_list.add(new HaptoData("The more you train, the more people there are who are weaker than you"));
        member_list.add(new HaptoData("When you're not training, someone else is."));
        member_list.add(new HaptoData("Muscles are torn in the gym, fed in the kitchen and built in bed."));
        member_list.add(new HaptoData("You are what you eat, so don't be fast, easy, cheap or fake."));
        member_list.add(new HaptoData("The secret to getting ahead is getting started."));
        member_list.add(new HaptoData("Do something today that your future self will thank you for."));
        member_list.add(new HaptoData("The only disability in life is a bad attitude."));
        member_list.add(new HaptoData("Squat like Channing Tatum is watching. - Erin Weiss"));
        member_list.add(new HaptoData("This month's diet is next month's body"));
        member_list.add(new HaptoData("You can only fail if you quit."));
        member_list.add(new HaptoData("Don't wish for it, work for it."));
        member_list.add(new HaptoData("A one hour workout is only 4% of your day. NO EXCUSES."));
        member_list.add(new HaptoData("Stop saying tomorrow."));
        member_list.add(new HaptoData("Pain is temporary, pride is forever."));
        member_list.add(new HaptoData("I'm doing it for ME."));
        member_list.add(new HaptoData("If you still look cute after the gym, you didn't workout hard enough."));
        member_list.add(new HaptoData("Sweat is your fat crying."));
        member_list.add(new HaptoData("I wear black to the gym because it's like a funeral for my fat."));
        member_list.add(new HaptoData("Fitness is not about being better than someone. Fitness is about being better than the person you were yesterday."));
        member_list.add(new HaptoData("Fitness is not about being better than someone. Fitness is about being better than the person you were yesterday."));
        member_list.add(new HaptoData("Take care of your body. It's the only place you have to live. -Jim Rohn"));
        member_list.add(new HaptoData("We all have the same amount of hours in our day. Deciding how to use your hours is up to you."));
        member_list.add(new HaptoData("Gotta squat before I tie the knot."));
        member_list.add(new HaptoData("Everything is hard before it is easy."));
        member_list.add(new HaptoData("Excuses don't burn calories."));
        member_list.add(new HaptoData("Excuses are for people who don't want it bad enough."));
        member_list.add(new HaptoData("Wake up with determination, go to bed with satisfaction."));

    }

    private void alone() {

        member_list = new ArrayList<HaptoData>();
        member_list.add(new HaptoData("Sometimes loneliness is my good friends!"));
        member_list.add(new HaptoData("I like to listen to sad music when I'm sad to make me double sad."));
        member_list.add(new HaptoData("Smile and no one will see how broken you are inside."));
        member_list.add(new HaptoData("Why does it always have to be the one that you love the most hits you the hardest?"));
        member_list.add(new HaptoData("The truth hurts for a little while, but lies hurt for a lifetime."));
        member_list.add(new HaptoData("Sometimes people have to cry out all their tears, to make room for a heart full of smiles."));
        member_list.add(new HaptoData("The greatest pain that comes from love is loving someone you can never have."));
        member_list.add(new HaptoData("I will wait till the day I can forget YOU or the day you realize you can't forget ME."));
        member_list.add(new HaptoData("I don't usually sleep enough, but when I do, it's still not enough."));
        member_list.add(new HaptoData("It's sad to be happy alone."));
        member_list.add(new HaptoData("When you feel lonely, Music is your only Friend."));
        member_list.add(new HaptoData("I love being alone, but I hate being lonely."));
        member_list.add(new HaptoData("I smile all the time so no one know how sad and lonely I am inside."));
        member_list.add(new HaptoData("I hate letting people into my life because they always leave."));
        member_list.add(new HaptoData("I just want to feel that I am important to someone."));
        member_list.add(new HaptoData("Being lonely is the hardest thing in life."));
        member_list.add(new HaptoData("The loneliest people on the planets are the biggest givers."));
        member_list.add(new HaptoData("Lonely is a MAN without LOVE."));
        member_list.add(new HaptoData("Sometimes in life it’s good to be Alone… so that No jackass can hurt you."));
        member_list.add(new HaptoData("Being lonely is like a storm with no rain, crying without tears."));
        member_list.add(new HaptoData("Behind those fake smiles their lies a lonely heart."));
        member_list.add(new HaptoData("Loneliness is a part of you life. It teaches us that we are not complete in ourselves."));
        member_list.add(new HaptoData("The worst loneliness is not to likes yourself."));
        member_list.add(new HaptoData("What loneliness is more lonely than distrust?"));
        member_list.add(new HaptoData("It is strange to be known so universally and yet to be so lonely."));
        member_list.add(new HaptoData("Loneliness is the most terrible poverty."));
        member_list.add(new HaptoData("Alone, all alone nobody, but nobody can make it out here alone."));
        member_list.add(new HaptoData("If you are afraid of being lonely, don't try to be right."));
        member_list.add(new HaptoData("Loneliness is the universal problem of rich people."));
        member_list.add(new HaptoData("To be alone is to be different, to be different is to be alone."));
        member_list.add(new HaptoData("Being lonely is like a storm with no rain, crying without tears."));
        member_list.add(new HaptoData("How did we go from talking everyday to strangers?"));
        member_list.add(new HaptoData("You always get hurt the moment you begin to care."));
        member_list.add(new HaptoData("If you're going to make me cry, at least be there to wipe away the tears."));
        member_list.add(new HaptoData("There is no point in crying, the tears wont bring you back to me."));
        member_list.add(new HaptoData("How can I go back to where the smile I had was real."));
        member_list.add(new HaptoData("Be patient and tough; some day this pain will be useful to you."));
        member_list.add(new HaptoData("Loneliness is the human condition. No one is ever going to fill that space."));
        member_list.add(new HaptoData("The pain is there to remind me that I'm still alive."));
        member_list.add(new HaptoData("Sometimes you need to run away just to see who will follow you."));
        member_list.add(new HaptoData("Maybe I am crazy but laughing makes the pain pass by."));
        member_list.add(new HaptoData("I have to cut because it's the only way I can smile."));
        member_list.add(new HaptoData("It seems to me that the harder I try the harder I fall."));
        member_list.add(new HaptoData("Only you can put a smile on my face when I'm sad..."));
        member_list.add(new HaptoData("I hate when people say they miss you, but don't make a effort to speak to you or see you."));
        member_list.add(new HaptoData("I hate being broken. I hate that I cannot go back."));
        member_list.add(new HaptoData("Why am I so afraid to lose you when you are not even mine?"));
        member_list.add(new HaptoData("Tears are prayers too. They travel to God when we can't speak."));
        member_list.add(new HaptoData("The only way is to move on, because if you don't you'll be suck where you are."));
        member_list.add(new HaptoData("It must be really sad to not be able to do something you love as the years go by."));
        member_list.add(new HaptoData("How did I go from being so happy, to so SAD!"));
        member_list.add(new HaptoData("Some friends only last but so long, then they step on you like dirt."));
        member_list.add(new HaptoData("Wake me up when things are going right for once."));
        member_list.add(new HaptoData("I'm invisible, until someone needs me."));
        member_list.add(new HaptoData("I feel crappy inside, like something just broke."));
        member_list.add(new HaptoData("No matter how hard I try you're never satisfied..."));
        member_list.add(new HaptoData("You make me feel like I'm going in spirals, I dont know what to do."));
        member_list.add(new HaptoData("People say never give up, but sometimes giving up is the best option because you realize you're just wasting your time."));
        member_list.add(new HaptoData("The wrong person will never give you what you want, but they'll make sure they get what they want from you."));
        member_list.add(new HaptoData("Your heart is the most precious part of you, never donate it to someone who doesn't appreciate it."));
        member_list.add(new HaptoData("I keep telling myself that I don't miss you, and that I don't love you, hoping someday I'll believe it."));
        member_list.add(new HaptoData("Sometimes it's easier to pretend you don't care than to admit its killing you."));
        member_list.add(new HaptoData("One day you'll find someone who doesn't care about your past because they want to be your future."));
        member_list.add(new HaptoData("My silence is just another word for my pain."));
        member_list.add(new HaptoData("I'm leaving for our own Good, Now i am happy, how about you?"));
        member_list.add(new HaptoData("People cry not because they are weak, It's because they've been strong for too long."));
        member_list.add(new HaptoData("I fall too fast, crush too hard, forgive too easy, and care too much."));
        member_list.add(new HaptoData("I hope you'll realize how much you're hurting me someday."));
        member_list.add(new HaptoData("If you give up on me, I'm going to give up on me too."));
        member_list.add(new HaptoData("Make the most beautiful mistakes, mine is you."));
        member_list.add(new HaptoData("I'm slowly giving up."));
        member_list.add(new HaptoData("I'm not afraid to fall in LOVE, I'm afraid to fall for a wrong person again."));
        member_list.add(new HaptoData("You're the only exception."));
        member_list.add(new HaptoData("Being ignored, worst feeling ever."));
        member_list.add(new HaptoData("I hate missing someone and not being able to do anything about it."));

    }

    private void heartTouching() {

        member_list = new ArrayList<HaptoData>();
        member_list.add(new HaptoData("Please BURN my sad memories."));
        member_list.add(new HaptoData("SLEEP away the sadness of today!"));
        member_list.add(new HaptoData("I miss how you always MADE time for me."));
        member_list.add(new HaptoData("I fell for you, but you didn't catch me"));
        member_list.add(new HaptoData("I always found the right one on wrong time."));
        member_list.add(new HaptoData("My silence is just another word for my PAIN."));
        member_list.add(new HaptoData("Never put your happiness in someone else's hands."));
        member_list.add(new HaptoData("Loneliness doesn't KILL, but sometimes I wish it DID."));
        member_list.add(new HaptoData("Make the most beautiful Mistakes, mine is you."));
        member_list.add(new HaptoData("If you give up on me, I'm going to give up on me too."));
        member_list.add(new HaptoData("I act like I don't care, but deep inside, it hurts."));
        member_list.add(new HaptoData("I want you to be FREE, but i can watch you SOAR away from me."));
        member_list.add(new HaptoData("We can do no great things, only small things with great love."));
        member_list.add(new HaptoData("I just want to fall asleep until i don't miss you anymore."));
        member_list.add(new HaptoData("What's the point in all this screaming, no one's listening anyway."));
        member_list.add(new HaptoData("I'm leaving for our own Good, Now I am happy, how about you?\n"));
        member_list.add(new HaptoData("Fall too fast, crush too hard, forgive too easy, and care too much."));
        member_list.add(new HaptoData("I hope you'll realize how much you're hurting me someday."));
        member_list.add(new HaptoData("I'm not afraid to fall in LOVE, I'm afraid to fall for a wrong person again."));
        member_list.add(new HaptoData("I hate missing someone and not being able to do anything about it."));
        member_list.add(new HaptoData("If is short, there is no time to leave important words UNSAID."));
        member_list.add(new HaptoData("Losing a part of yourself is much easier than losing the one you love."));
        member_list.add(new HaptoData("It's never the tear that measure the PAIN, sometimes its the SMILE we fake."));
        member_list.add(new HaptoData("No matter how much you have hurt me, I still pray for you every night."));
        member_list.add(new HaptoData("Never giveup on someone you cant spend a day not thinking about."));
        member_list.add(new HaptoData("My silence spoke a thousand words, but you never heard them."));
        member_list.add(new HaptoData("You made me Laugh you made me cry but you killed me when you said goodbye"));
        member_list.add(new HaptoData("People cry not because they are weak, It's because they've been strong for too long."));
        member_list.add(new HaptoData("People sometimes think that you do not love them but sometimes you have to say bye."));
        member_list.add(new HaptoData("I'm sad. No. I'm mad. No, wait.. I don't know I just need a freaking hug."));
        member_list.add(new HaptoData("Six letters, two words, easy to say, hard to explain, harder to do. MOVE ON."));
        member_list.add(new HaptoData("I have Many problems in my life.. But My lips don't know that They Always Smile."));
        member_list.add(new HaptoData("Your mind may be sad because you're not with him, but your heart is happy just knowing him."));
        member_list.add(new HaptoData("Never let the pain from your past punish your present and paralyze your future."));
        member_list.add(new HaptoData("You'll never realize the value of what you have, until what you have is no longer yours."));
        member_list.add(new HaptoData("No one knows what it's like to be the bad man, to be the sad man, behind blue eyes."));
        member_list.add(new HaptoData("You'll never realize the value of what you have, until what you have is no longer yours."));
        member_list.add(new HaptoData("This isn't a Whatsapp Status..this is just to show that no status matches my feelings right now."));
        member_list.add(new HaptoData("Everyone says to follow your heart, but what if your heart wants something it can never have"));
        member_list.add(new HaptoData("The hardest part in life is trying to show the smile you know is fake and to hide the tears that won't stop."));
        member_list.add(new HaptoData("Don't trust too much, don't love too much, don't care too much because that 'too much' will hurt you so much!"));
        member_list.add(new HaptoData("Sometimes when I say: I am okay.. I want someone Too look me in the eyes Hug me tight and say: I know you're not."));
        member_list.add(new HaptoData("Waiting is painful. Forgetting is painful. But not knowing which to do is the worse kind of suffering."));
        member_list.add(new HaptoData("It hurts the worst when the person that made you feel so special yesterday, makes you feel so unwanted today."));
        member_list.add(new HaptoData("If I could be anything, l would be ur tear, so l could be born in ur eye, live down ur cheek and die on ur lips."));
        member_list.add(new HaptoData("Missing someone is your heart's way of reminding you that you love them."));
        member_list.add(new HaptoData("When I miss you I re-read our old conversations and smile like an idiot."));
        member_list.add(new HaptoData("When I close my eyes I see you, when I open my eyes I miss you."));
        member_list.add(new HaptoData("When I miss you it seems every song I listen to is about you."));
        member_list.add(new HaptoData("I'll miss you forever like the starts miss the sun in the morning skies."));
        member_list.add(new HaptoData("You aren't the person I knew back then."));
        member_list.add(new HaptoData("I'm invisible, until someone needs me."));
        member_list.add(new HaptoData("Love can't be found Where it doesn't exist."));
        member_list.add(new HaptoData("LOVE is not free the price is your heart."));
        member_list.add(new HaptoData("The greatest pain that comes from love is loving someone you can never have."));
        member_list.add(new HaptoData("It's never going to be the same again. And that's whats killing me."));
        member_list.add(new HaptoData("Some of us are just trying to get through the day without falling apart."));
        member_list.add(new HaptoData("The higher you climb on love's ladder, the harder you fall."));
        member_list.add(new HaptoData("Going to keep all secrets to myself since some people i can't trust."));
        member_list.add(new HaptoData("Why be mean to animals when they treat u better then people."));
        member_list.add(new HaptoData("There is no point in crying, the tears wont bring you back to me."));
        member_list.add(new HaptoData("It's not how tragically we suffer but how miracously we live."));
        member_list.add(new HaptoData("Sometimes it's better to be alone. Nobody can hurt you!"));
        member_list.add(new HaptoData("I'm freezing, I'm starving, I'm bleeding to death, Everything's fine."));
        member_list.add(new HaptoData("The only way is to move on, because if you don't you'll be suck where you are.\n"));
        member_list.add(new HaptoData("The pain is there to remind me that I'm still alive."));
        member_list.add(new HaptoData("The have no idea what a bottomless pit of misery I am."));
        member_list.add(new HaptoData("I feel crappy inside, like something just broke."));
        member_list.add(new HaptoData("I wish I could ignore you, the way you ignore me."));
        member_list.add(new HaptoData("I just want you, that's all."));
        member_list.add(new HaptoData("I care too much that's the problem."));
        member_list.add(new HaptoData("I care too much that's the problem."));
        member_list.add(new HaptoData("Love is like a rubber band held at both ends by two people. When one leaves.. it hurts the other."));

    }



    private void clickListner() {

        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }

    @Override
    public void onPause() {
        // This method should be called in the parent Activity's onPause() method.
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        // This method should be called in the parent Activity's onResume() method.
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    @Override
    public void onDestroy() {
        // This method should be called in the parent Activity's onDestroy() method.
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }
}
