package diy.covidApi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import diy.Repository
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {


    private val scope = MainScope()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        try{
            scope.launch{
                val data = Repository.getCovidInformation(1,5)

                data?.forEach {
                    it?.let{
                        Log.d("FOR문으로 하나씩 lat값 찍기 루프 ",it.lat.toString())
                    }

                }
                //Log.d("DATA여기야",data.toString())


            }

        }catch (e: Exception){
            Log.d("catch phrase","오류오류")

        }finally {

        }






    }
}