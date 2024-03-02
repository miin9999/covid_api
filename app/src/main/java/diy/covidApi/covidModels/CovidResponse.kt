package diy.covidApi.covidModels


import com.google.gson.annotations.SerializedName

data class CovidResponse(
    @SerializedName("currentCount")
    var currentCount: Int?,
    @SerializedName("data")
    var covidData: List<Data?>?,
    @SerializedName("matchCount")
    var matchCount: Int?,
    @SerializedName("page")
    var page: Int?,
    @SerializedName("perPage")
    var perPage: Int?,
    @SerializedName("totalCount")
    var totalCount: Int?
)