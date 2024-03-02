package diy

import diy.covidApi.BuildConfig
import diy.covidApi.covidModels.CovidResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CovidService {


    @GET("15077586/v1/centers?" +
            "&serviceKey=Hxdghoyb1ItsXcB20D9U1Czrfsk38mVIfZr8Sk5rLnb%2BMANAxBMYN9G0ox3JhdLLVDSmGGsbahMPx6gnQxQIGQ%3D%3D")
    suspend fun getCovidInfo(
        @Query("page") page:Int,
        @Query("perPage") perpage:Int,
    ):Response<CovidResponse>
}