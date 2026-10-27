package cn.bluemobi.dylan.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface DemoApiService {
    @retrofit2.http.POST(" ")
    @retrofit2.http.Multipart
    rx.e<okhttp3.ResponseBody> editHeadImage(@retrofit2.http.Part("app") okhttp3.RequestBody r1, @retrofit2.http.Part("class") okhttp3.RequestBody r2, @retrofit2.http.Part("sign") okhttp3.RequestBody r3, @retrofit2.http.Part("userid") okhttp3.RequestBody r4, @retrofit2.http.Part okhttp3.MultipartBody.Part r5);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(" ")
    rx.e<okhttp3.ResponseBody> login(@retrofit2.http.Field("app") java.lang.String r1, @retrofit2.http.Field("class") java.lang.String r2, @retrofit2.http.Field("phone") java.lang.String r3, @retrofit2.http.Field("password") java.lang.String r4);

    @retrofit2.http.POST(" ")
    @retrofit2.http.Multipart
    rx.e<okhttp3.ResponseBody> publishTask(@retrofit2.http.Part("app") okhttp3.RequestBody r1, @retrofit2.http.Part("class") okhttp3.RequestBody r2, @retrofit2.http.Part("sign") okhttp3.RequestBody r3, @retrofit2.http.Part("userid") okhttp3.RequestBody r4, @retrofit2.http.Part("task_category_id") okhttp3.RequestBody r5, @retrofit2.http.Part("task_poundage") okhttp3.RequestBody r6, @retrofit2.http.Part("task_title") okhttp3.RequestBody r7, @retrofit2.http.Part("task_status_time") okhttp3.RequestBody r8, @retrofit2.http.Part("task_end_time") okhttp3.RequestBody r9, @retrofit2.http.Part("task_content") okhttp3.RequestBody r10, @retrofit2.http.Part("task_special") okhttp3.RequestBody r11, @retrofit2.http.Part("task_reward") okhttp3.RequestBody r12, @retrofit2.http.Part("task_lon") okhttp3.RequestBody r13, @retrofit2.http.Part("task_lat") okhttp3.RequestBody r14, @retrofit2.http.Part("task_address") okhttp3.RequestBody r15, @retrofit2.http.Part("task_img_count") okhttp3.RequestBody r16, @retrofit2.http.PartMap java.util.Map<java.lang.String, okhttp3.RequestBody> r17);
}
