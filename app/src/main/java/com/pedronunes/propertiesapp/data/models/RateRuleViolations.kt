package com.pedronunes.propertiesapp.data.models

import com.google.gson.annotations.SerializedName


data class RateRuleViolations(

    @SerializedName("NightsStay") var NightsStay: NightsStay? = NightsStay()

)