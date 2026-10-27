package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface j4 {
    @retrofit2.http.POST("api/plugin_change")
    rx.e<java.lang.String> A(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/an/gc/pn")
    rx.e<com.acse.ottn.model.AccessiblityModel> B(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/an/gc/jlj")
    rx.e<java.lang.String> C(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/close_remind")
    rx.e<java.lang.String> D(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/an/gc/mt_ele")
    rx.e<java.lang.String> E(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/check_session")
    rx.e<java.lang.String> a(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/an/gc/set_close_status")
    rx.e<java.lang.String> b(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/an/gc/get_app_list")
    rx.e<java.lang.String> c(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/mobile_app")
    rx.e<java.lang.String> d(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/an/gc/allocation_result")
    rx.e<java.lang.String> e(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/an/gc/verify")
    rx.e<java.lang.String> f(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/oppo_state")
    rx.e<java.lang.String> g(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/cut_down")
    rx.e<com.acse.ottn.model.AdInfoModel> h(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/report")
    rx.e<java.lang.String> i(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/an/gc/get_close_status")
    rx.e<java.lang.String> j(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/member")
    rx.e<java.lang.String> k(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/an/gc/scroll")
    rx.e<com.acse.ottn.model.AccessiblityModel> l(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/time_limit")
    rx.e<java.lang.String> m(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/push_ad_ecpm")
    rx.e<java.lang.String> n(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/sys_pic")
    rx.e<java.lang.String> o(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/an/gc/save_settings")
    rx.e<java.lang.String> p(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/an/gc/lon_lat")
    rx.e<java.lang.String> q(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/data_check")
    rx.e<java.lang.String> r(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/clear_ad_time")
    rx.e<java.lang.String> s(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/limit_tips")
    rx.e<java.lang.String> t(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/close_plugin")
    rx.e<java.lang.String> u(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/mobile_check")
    rx.e<java.lang.String> v(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/an/gc/local_ref")
    rx.e<java.lang.String> w(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/sys_state")
    rx.e<java.lang.String> x(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/an/gc/allocation_app")
    rx.e<java.lang.String> y(@retrofit2.http.Body okhttp3.RequestBody r1);

    @retrofit2.http.POST("api/plugin_check")
    rx.e<java.lang.String> z(@retrofit2.http.Body okhttp3.RequestBody r1);
}
