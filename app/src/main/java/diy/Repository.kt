package diy

import diy.covidApi.covidModels.Data
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object Repository {

    //todo 메인에서 접근할 suspend 함수

    suspend fun getCovidInformation(pageNum:Int, perPageNum:Int):List<Data?>?=
        retrofit2.getCovidInfo(pageNum,perPageNum)
            .body()
            ?.covidData
//            ?.firstOrNull()
//            ?.address.toString()
    // 리스트의 첫 번째 데이터를 가져오는데, 그 데이터의 address를 가져오는 것이다



    //todo retrofit 빌드하기


    private val retrofit2 : CovidService by lazy{
        Retrofit.Builder()
            .baseUrl(Url.COVID_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create()
    }
}