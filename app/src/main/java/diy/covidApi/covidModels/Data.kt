package diy.covidApi.covidModels


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("address")
    var address: String?,
    @SerializedName("centerName")
    var centerName: String?,
    @SerializedName("centerType")
    var centerType: String?,
    @SerializedName("createdAt")
    var createdAt: String?,
    @SerializedName("facilityName")
    var facilityName: String?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("lat")
    var lat: String?,
    @SerializedName("lng")
    var lng: String?,
    @SerializedName("org")
    var org: String?,
    @SerializedName("phoneNumber")
    var phoneNumber: String?,
    @SerializedName("sido")
    var sido: String?,
    @SerializedName("sigungu")
    var sigungu: String?,
    @SerializedName("updatedAt")
    var updatedAt: String?,
    @SerializedName("zipCode")
    var zipCode: String?
)