package fr.franzdeussom.top10;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {

    private MediaPlayer ninhooutro;
    private SeekBar baroutro;

    private MediaPlayer niskaRevendicateur;
    private SeekBar barrevendicateur;

    private MediaPlayer hiro;
    private SeekBar barmenspas;

    private MediaPlayer hiroTroptard;
    private SeekBar bartrop;

    private MediaPlayer dadjuAmour;
    private SeekBar baramour;

    private MediaPlayer jamais;
    private SeekBar barjamais;

    private MediaPlayer popSmoke;
    private SeekBar barpop;

    private MediaPlayer hatik;
    private SeekBar barhatik;

    private MediaPlayer damso2;
    private SeekBar bardams2;

    private MediaPlayer damsoR;
    private SeekBar bardamsr;

    private MediaPlayer ninhovvs;
    private SeekBar barvvs;

    private MediaPlayer travis;
    private SeekBar bartravis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//1
        this.ninhooutro = MediaPlayer.create(getApplicationContext(), R.raw.ninho_outro);
        this.baroutro = (SeekBar) findViewById(R.id.soundbaroutro);
    
//2
        this.niskaRevendicateur = MediaPlayer.create(getApplicationContext(), R.raw.niska_revendicateur);
        this.barrevendicateur = (SeekBar) findViewById(R.id.s2);
    
//3
        this.damso2 = MediaPlayer.create(getApplicationContext(), R.raw.damso_2);
        this.bardams2 = (SeekBar) findViewById(R.id.s7);
    
//4
        this.hiroTroptard = MediaPlayer.create(getApplicationContext(), R.raw.hirotroptard);
        this.bartrop = (SeekBar) findViewById(R.id.s3);
    
//5
        this.hiro = MediaPlayer.create(getApplicationContext(), R.raw.hiro_mens_pas);
        this.barmenspas = (SeekBar) findViewById(R.id.s4);
       
//6
        this.damsoR = MediaPlayer.create(getApplicationContext(), R.raw.damsor);
        this.bardamsr = (SeekBar) findViewById(R.id.s12);
        
//7
        this.popSmoke = MediaPlayer.create(getApplicationContext(), R.raw.popsmoke_invincible);
        this.barpop = (SeekBar) findViewById(R.id.s9);
    
//8
        this.dadjuAmour = MediaPlayer.create(getApplicationContext(), R.raw.dadju_amour);
        this.baramour = (SeekBar) findViewById(R.id.s6);
       
//9
        this.jamais = MediaPlayer.create(getApplicationContext(), R.raw.mhd);
        this.barjamais = (SeekBar) findViewById(R.id.s8);
       
//10
        this.ninhovvs = MediaPlayer.create(getApplicationContext(), R.raw.vvs);
        this.barvvs = (SeekBar) findViewById(R.id.s10);
       
//11
        this.hatik = MediaPlayer.create(getApplicationContext(), R.raw.hatik_pour);
        this.barhatik = (SeekBar) findViewById(R.id.s5);
       
//12
        this.travis = MediaPlayer.create(getApplicationContext(), R.raw.travis_scott);
        this.bartravis = (SeekBar) findViewById(R.id.s11);
       

        //1- outro_progress
        Timer tempsoutr = new Timer();
        tempsoutr.schedule(new TimerTask() {
            @Override
            public void run() {
                baroutro.setProgress(ninhooutro.getCurrentPosition() / 1000);
            }
        }, 1000, 1000);
        //2-niska revendicateur
        Timer tempsrevendica = new Timer();
        tempsrevendica.schedule(new TimerTask() {
            @Override
            public void run() {
                barrevendicateur.setProgress(niskaRevendicateur.getCurrentPosition() / 1000);
            }
        }, 1000, 1000);

        //3- hiro trop tard
        Timer tempstroptard = new Timer();
        tempstroptard.schedule(new TimerTask() {
            @Override
            public void run() {
                bartrop.setProgress(hiroTroptard.getCurrentPosition() / 1000);
            }
        }, 1000, 1000);

        //4- mens pas
        Timer tempsmens = new Timer();
        tempsmens.schedule(new TimerTask() {
            @Override
            public void run() {
                barmenspas.setProgress(hiro.getCurrentPosition() / 1000);
            }
        }, 1000, 1000);

        //5- hatik pour la nuit
        Timer tempspour = new Timer();
        tempspour.schedule(new TimerTask() {
            @Override
            public void run() {
                barhatik.setProgress(hatik.getCurrentPosition() / 1000);
            }
        }, 1000, 1000);

        //6-dadju amour toxic
        Timer tempsamour = new Timer();
        tempsamour.schedule(new TimerTask() {
            @Override
            public void run() {
                baramour.setProgress(dadjuAmour.getCurrentPosition() / 1000);
            }
        }, 1000, 1000);

        //7- damso 2
        Timer tempsdams2 = new Timer();
        tempsdams2.schedule(new TimerTask() {
            @Override
            public void run() {
                bardams2.setProgress(damso2.getCurrentPosition() / 1000);
            }
        }, 1000, 1000);
        //8- mhd jamais
        Timer tempsjamais = new Timer();
        tempsjamais.schedule(new TimerTask() {
            @Override
            public void run() {
                barjamais.setProgress(jamais.getCurrentPosition() / 1000);
            }
        }, 1000, 1000);
        //9-popsmoke invincible
        Timer tempspop = new Timer();
        tempspop.schedule(new TimerTask() {
            @Override
            public void run() {
                barpop.setProgress(popSmoke.getCurrentPosition() / 1000);
            }
        }, 1000, 1000);

        //10- vvs
        Timer tempsvvs = new Timer();
        tempsvvs.schedule(new TimerTask() {
            @Override
            public void run() {
                barvvs.setProgress(ninhovvs.getCurrentPosition() / 1000);
            }
        }, 1000, 1000);

        //11-travis scott
        Timer tempstravis = new Timer();
        tempstravis.schedule(new TimerTask() {
            @Override
            public void run() {
                bartravis.setProgress(travis.getCurrentPosition() / 1000);
            }
        }, 1000, 1000);
        //12- damso respect r
        Timer tempsdamsor = new Timer();
        tempsdamsor.schedule(new TimerTask() {
            @Override
            public void run() {
                bardamsr.setProgress(damsoR.getCurrentPosition() / 1000);
            }
        }, 1000, 1000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    //1 class ninho outre
    public void playSoundoutro(View view) {

        Button button = (Button) view;


        //condition d'arret si precedement joué


        if (niskaRevendicateur.isPlaying() || hiroTroptard.isPlaying() || hiro.isPlaying() || hatik.isPlaying() || dadjuAmour.isPlaying() || popSmoke.isPlaying() || jamais.isPlaying() || popSmoke.isPlaying() ||
                ninhovvs.isPlaying() || travis.isPlaying() || damsoR.isPlaying() || damso2.isPlaying() ) {

            niskaRevendicateur.pause();//1
            hiro.pause();//2
            
            hatik.pause();//3
            
            dadjuAmour.pause();//4
            
            popSmoke.pause();//5
            
            jamais.pause();//6
            
            damso2.pause();//7
            
            damsoR.pause();//8
            ninhovvs.pause();//9
           
            travis.pause();//10
            hiroTroptard.pause();//11
            button.setText(getString(R.string.playsSound));
        }

       else if (ninhooutro.isPlaying())
        {
            ninhooutro.pause();
            button.setText(getString(R.string.playsSound));
        }
        else
        {
            ninhooutro.start();
            button.setText(getString(R.string.pause));
        }
    }

    //2 class niska revendicateur
    public void playSoundrevendicateur(View view) {
        Button button = (Button) view;

        //condition d'arret si precedement joué


        if (ninhooutro.isPlaying() || hiroTroptard.isPlaying() || hiro.isPlaying() || hatik.isPlaying() || dadjuAmour.isPlaying() || popSmoke.isPlaying() || jamais.isPlaying() || popSmoke.isPlaying() ||
                ninhovvs.isPlaying() || travis.isPlaying() || damsoR.isPlaying() || damso2.isPlaying() ) {

            ninhooutro.pause();//1
            
            hiro.pause();//2
            
            hatik.pause();//3
            
            dadjuAmour.pause();//4
            
            popSmoke.pause();//5
            
            jamais.pause();//6
            
            damso2.pause();//7
            
            damsoR.pause();//8
            
            ninhovvs.pause();//9
            
            travis.pause();//10
            
            hiroTroptard.pause();//11
            button.setText(getString(R.string.playsSound);
        }


       else if (niskaRevendicateur.isPlaying())
        {
            niskaRevendicateur.pause();
            button.setText(getString(R.string.playsSound));
        }
        else
        {
            niskaRevendicateur.start();
            button.setText(getString(R.string.pause));
        }
    }
    //3 hiro trop tard
    public void playSoundTroptard(View view) {
        Button button = (Button) view;

        if (ninhooutro.isPlaying() || niskaRevendicateur.isPlaying()|| hiro.isPlaying() || hatik.isPlaying() || dadjuAmour.isPlaying() || popSmoke.isPlaying() || jamais.isPlaying() || popSmoke.isPlaying() ||
                ninhovvs.isPlaying() || travis.isPlaying() || damsoR.isPlaying() || damso2.isPlaying() ) {

            ninhooutro.pause();//1
            

            hiro.pause();//2
            

            hatik.pause();//3
            

            dadjuAmour.pause();//4
            

            popSmoke.pause();//5
            

            jamais.pause();//6
            

            damso2.pause();//7
            

            damsoR.pause();//8
            
            ninhovvs.pause();//9
            
            travis.pause();//10
            
            niskaRevendicateur.pause();//11
            button.setText(getString(R.string.playsSound);
        }


        if (hiroTroptard.isPlaying())
        {
            hiroTroptard.pause();
            button.setText(getString(R.string.playsSound));
        }
        else
        {
            hiroTroptard.start();
            button.setText(getString(R.string.pause));
        }
    }
    //4 hiro me mens pas
    public void playSoundmenspas(View view) {
        Button button = (Button) view;

        if (ninhooutro.isPlaying() || niskaRevendicateur.isPlaying()|| hiroTroptard.isPlaying() || hatik.isPlaying() || dadjuAmour.isPlaying() || popSmoke.isPlaying() || jamais.isPlaying() || popSmoke.isPlaying() ||
                ninhovvs.isPlaying() || travis.isPlaying() || damsoR.isPlaying() || damso2.isPlaying() ) {

            ninhooutro.pause();//1
            
            hiroTroptard.pause();//2
            
            hatik.pause();//3
            
            dadjuAmour.pause();//4
            
            popSmoke.pause();//5
            
            jamais.pause();//6
            
            damso2.pause();//7
            
            damsoR.pause();//8
            
            ninhovvs.pause();//9
            
            travis.pause();//10
            
            niskaRevendicateur.pause();//11
            button.setText(getString(R.string.playsSound);
        }

        if (hiro.isPlaying())
        {
            hiro.pause();
            button.setText(getString(R.string.playsSound));
        }
        else
        {
            hiro.start();
            button.setText(getString(R.string.pause));
        }
    }
    //5 hatik pour la nuit
    public void playSoundpourlanuit(View view) {
        Button button = (Button) view;

        if (ninhooutro.isPlaying() || niskaRevendicateur.isPlaying()|| hiroTroptard.isPlaying() || hiro.isPlaying() || dadjuAmour.isPlaying() || popSmoke.isPlaying() || jamais.isPlaying() || popSmoke.isPlaying() ||
                ninhovvs.isPlaying() || travis.isPlaying() || damsoR.isPlaying() || damso2.isPlaying() ) {

            ninhooutro.pause();//1
            
            hiroTroptard.pause();//2
            
            hiro.pause();//3
            
            dadjuAmour.pause();//4
            
            popSmoke.pause();//5
            
            jamais.pause();//6
            
            damso2.pause();//7
            
            damsoR.pause();//8
            
            ninhovvs.pause();//9
            
            travis.pause();//10
            
            niskaRevendicateur.pause();//11
            button.setText(getString(R.string.playsSound);
            
        }

        if (hatik.isPlaying())
        {
            hatik.pause();
            button.setText(getString(R.string.playsSound));
        }
        else
        {
            hatik.start();
            button.setText(getString(R.string.pause));
        }
    }
    //6 dadju amour toxic
    public void playSoundamour_toxic(View view) {
        Button button = (Button) view;

        if (ninhooutro.isPlaying() || niskaRevendicateur.isPlaying()|| hiroTroptard.isPlaying() || hiro.isPlaying() || hatik.isPlaying() || popSmoke.isPlaying() || jamais.isPlaying() || popSmoke.isPlaying() ||
                ninhovvs.isPlaying() || travis.isPlaying() || damsoR.isPlaying() || damso2.isPlaying() ) {

            ninhooutro.pause();//1
        
            hiroTroptard.pause();//2
        
            hiro.pause();//3
        
            hatik.pause(); //4
        
            popSmoke.pause();//5
        
            jamais.pause();//6
        
            damso2.pause();//7
        
            damsoR.pause();//8
        
            ninhovvs.pause();//9
        
            travis.pause();//10
        
            niskaRevendicateur.pause();//11
            button.setText(getString(R.string.playsSound));
        }

        if (dadjuAmour.isPlaying())
        {
            dadjuAmour.pause();
            button.setText(getString(R.string.playsSound));
        }
        else
        {
            dadjuAmour.start();
            button.setText(getString(R.string.pause));
        }
    }
    //7 damso2etoiles de mer
    public void playSound2toiles(View view) {
        Button button = (Button) view;

        if (ninhooutro.isPlaying() || niskaRevendicateur.isPlaying()|| hiroTroptard.isPlaying() || hiro.isPlaying() || hatik.isPlaying() || popSmoke.isPlaying() || jamais.isPlaying() || popSmoke.isPlaying() ||
                ninhovvs.isPlaying() || travis.isPlaying() || damsoR.isPlaying() || dadjuAmour.isPlaying() ) {

            ninhooutro.pause();//1
            
            hiroTroptard.pause();//2
            
            hiro.pause();//3
            
            hatik.pause(); //4
            
            popSmoke.pause();//5
            
            jamais.pause();//6
            
            dadjuAmour.pause();//7
            
            damsoR.pause();//8
            
            ninhovvs.pause();//9
            
            travis.pause();//10
            
            niskaRevendicateur.pause();//11
            button.setText(getString(R.string.playsSound));
        }

        if (damso2.isPlaying())
        {
            damso2.pause();
            button.setText(getString(R.string.playsSound));
        }
        else
        {
            damso2.start();
            button.setText(getString(R.string.pause));
        }
    }
    //8 mhd jamais
    public void playSoundjamais(View view) {
        Button button = (Button) view;

        if (ninhooutro.isPlaying() || niskaRevendicateur.isPlaying()|| hiroTroptard.isPlaying() || hiro.isPlaying() || hatik.isPlaying() || popSmoke.isPlaying() || damso2.isPlaying()|| popSmoke.isPlaying() ||
                ninhovvs.isPlaying() || travis.isPlaying() || damsoR.isPlaying() || dadjuAmour.isPlaying() ) {

            ninhooutro.pause();//1
            
            hiroTroptard.pause();//2
            
            hiro.pause();//3
            
            hatik.pause(); //4
            
            popSmoke.pause();//5
            
            damso2.pause();//6
            
            dadjuAmour.pause();//7
            
            damsoR.pause();//8
            
            ninhovvs.pause();//9
            
            travis.pause();//10
            
            niskaRevendicateur.pause();//11
            button.setText(getString(R.string.playsSound));
        }

        if (jamais.isPlaying())
        {
            jamais.pause();
            button.setText(getString(R.string.playsSound));
        }
        else
        {
            jamais.start();
            button.setText(getString(R.string.pause));
        }
    }
    //9 popsmoke invincible
    public void playSoundpopsmoke(View view) {
        Button button = (Button) view;

        if (ninhooutro.isPlaying() || niskaRevendicateur.isPlaying()|| hiroTroptard.isPlaying() || hiro.isPlaying() || hatik.isPlaying() || popSmoke.isPlaying() || damso2.isPlaying()|| jamais.isPlaying() ||
                ninhovvs.isPlaying() || travis.isPlaying() || damsoR.isPlaying() || dadjuAmour.isPlaying() ) {

            ninhooutro.pause();//1
            
            hiroTroptard.pause();//2
            
            hiro.pause();//3
            
            hatik.pause(); //4
            
            jamais.pause();//5
            
            damso2.pause();//6
            
            dadjuAmour.pause();//7
            
            damsoR.pause();//8
            
            ninhovvs.pause();//9
            
            travis.pause();//10
            
            niskaRevendicateur.pause();//11
            button.setText(getString(R.string.playsSound));
        }

        if (popSmoke.isPlaying())
        {
            popSmoke.pause();
            button.setText(getString(R.string.playsSound));
        }
        else
        {
            popSmoke.start();
            button.setText(getString(R.string.pause));
        }
    }
    //10 vvs
    public void playSoundvvs(View view) {
        Button button = (Button) view;

        if (ninhooutro.isPlaying() || niskaRevendicateur.isPlaying()|| hiroTroptard.isPlaying() || hiro.isPlaying() || hatik.isPlaying() || popSmoke.isPlaying() || damso2.isPlaying()|| jamais.isPlaying() ||
                popSmoke.isPlaying() || travis.isPlaying() || damsoR.isPlaying() || dadjuAmour.isPlaying() ) {

            ninhooutro.pause();//1
        
            hiroTroptard.pause();//2
        
            hiro.pause();//3
        
            hatik.pause(); //4
        
            jamais.pause();//5
        
            damso2.pause();//6
        
            dadjuAmour.pause();//7
        
            damsoR.pause();//8
        
            popSmoke.pause();//9
        
            travis.pause();//10
        
            niskaRevendicateur.pause();//11
            button.setText(getString(R.string.playsSound));
        }

        if (ninhovvs.isPlaying())
        {
            ninhovvs.pause();
            button.setText(getString(R.string.playsSound));
        }
        else
        {
            ninhovvs.start();
            button.setText(getString(R.string.pause));
        }
    }

    //11 travis scott highest in the room
    public void playSoundhgtroom(View view) {
        Button button = (Button) view;

        if (ninhooutro.isPlaying() || niskaRevendicateur.isPlaying()|| hiroTroptard.isPlaying() || hiro.isPlaying() || hatik.isPlaying() || popSmoke.isPlaying() || damso2.isPlaying()|| jamais.isPlaying() ||
                popSmoke.isPlaying() || ninhovvs.isPlaying() || damsoR.isPlaying() || dadjuAmour.isPlaying() ) {

            ninhooutro.pause();//1
        
            hiroTroptard.pause();//2
        
            hiro.pause();//3
        
            hatik.pause(); //4
        
            jamais.pause();//5
        
            damso2.pause();//6
        
            dadjuAmour.pause();//7
        
            damsoR.pause();//8
        
            popSmoke.pause();//9
        
            ninhovvs.pause();//10
        
            niskaRevendicateur.pause();//11
            button.setText(getString(R.string.playsSound);
        }

        if (travis.isPlaying())
        {
            travis.pause();
            button.setText(getString(R.string.playsSound));
        }
        else
        {
            travis.start();
            button.setText(getString(R.string.pause));
        }
    }

    //12 damso Respect
    public void playSoundrespect(View view) {
        Button button = (Button) view;

        if (ninhooutro.isPlaying() || niskaRevendicateur.isPlaying()|| hiroTroptard.isPlaying() || hiro.isPlaying() || hatik.isPlaying() || popSmoke.isPlaying() || damso2.isPlaying()|| jamais.isPlaying() ||
                popSmoke.isPlaying() || ninhovvs.isPlaying() || travis.isPlaying()|| dadjuAmour.isPlaying() ) {

            ninhooutro.pause();//1
            
            hiroTroptard.pause();//2
            
            hiro.pause();//3
            
            hatik.pause(); //4
            
            jamais.pause();//5
            
            damso2.pause();//6
            
            dadjuAmour.pause();//7
            
            travis.pause();//8
            
            popSmoke.pause();//9
            
            ninhovvs.pause();//10
            
            niskaRevendicateur.pause();//11
            button.setText(getString(R.string.playsSound));
        }


        if (damsoR.isPlaying())
        {
            damsoR.pause();
            button.setText(getString(R.string.playsSound));
        }
        else
        {
            damsoR.start();
            button.setText(getString(R.string.pause));
        }
    }
}
