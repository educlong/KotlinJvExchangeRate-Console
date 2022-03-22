package elong.test

import com.google.gson.Gson
import elong.model.TiGia
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {
    var link:String="https://www.dongabank.com.vn/exchange/export"
    var isr:InputStreamReader=InputStreamReader((URL(link).openConnection() as HttpURLConnection).inputStream,"UTF-8")
    var br:BufferedReader= BufferedReader(isr)
    var tiGia=Gson().fromJson(br.readText().replace("(","").replace(")",""),TiGia::class.java)
    br.close()
    isr.close()
    for (item in tiGia.Items)
        println(item)
}