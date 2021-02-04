package app.itakura.reirei.a07drumapp

import android.media.AudioAttributes
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    private lateinit var mSoundPool: SoundPool

    private lateinit var mSoundId : Array<Int?>

    private var mSoundResource = arrayOf(
        R.raw.cymbal1,
        R.raw.cymbal2,
        R.raw.cymbal3,
        R.raw.tom1,
        R.raw.tom2,
        R.raw.tom3,
        R.raw.hihat,
        R.raw.snare,
        R.raw.bass

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onResume() {
        super.onResume()

        val audioAttributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_MEDIA)
            .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
            .build()

        mSoundPool = SoundPool.Builder()
            .setAudioAttributes(audioAttributes)
            .setMaxStreams(mSoundResource.size)
            .build()

        mSoundId = arrayOfNulls(mSoundResource.size)

        for (i in 0 .. (mSoundResource.size-1)){
            mSoundId[i] = mSoundPool.load(applicationContext,mSoundResource[i],0)

        }


    }

    override fun onDestroy() {
        super.onDestroy()

        mSoundPool.release()
    }


    fun cymbal1(view: View){
        if (mSoundId[0] != null){
            mSoundPool.play(mSoundId[0] as Int,1.0F,1.0F,0,0,1.0F)
        }
    }


    fun cymbal2(view: View){
        if (mSoundId[1] != null){
            mSoundPool.play(mSoundId[1] as Int,1.0F,1.0F,0,0,1.0F)
        }
    }

    fun cymbal3(view: View){
        if (mSoundId[2] != null){
            mSoundPool.play(mSoundId[2] as Int,1.0F,1.0F,0,0,1.0F)
        }
    }

    fun tom1(view: View){
        if (mSoundId[3] != null){
            mSoundPool.play(mSoundId[3] as Int,1.0F,1.0F,0,0,1.0F)
        }
    }

    fun tom2(view: View){
        if (mSoundId[4] != null){
            mSoundPool.play(mSoundId[4] as Int,1.0F,1.0F,0,0,1.0F)
        }
    }

    fun tom3(view: View){
        if (mSoundId[5] != null){
            mSoundPool.play(mSoundId[5] as Int,1.0F,1.0F,0,0,1.0F)
        }
    }

    fun hihat(view: View){
        if (mSoundId[6] != null){
            mSoundPool.play(mSoundId[6] as Int,1.0F,1.0F,0,0,1.0F)
        }
    }

    fun snare(view: View){
        if (mSoundId[7] != null){
            mSoundPool.play(mSoundId[7] as Int,1.0F,1.0F,0,0,1.0F)
        }
    }

    fun bass(view: View){
        if (mSoundId[8] != null){
            mSoundPool.play(mSoundId[8] as Int,1.0F,1.0F,0,0,1.0F)
        }
    }



}


