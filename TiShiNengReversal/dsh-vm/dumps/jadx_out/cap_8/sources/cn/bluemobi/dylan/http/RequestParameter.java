package cn.bluemobi.dylan.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RequestParameter {
    public RequestParameter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static okhttp3.MultipartBody.Part getFilePart(java.lang.String r1, java.io.File r2) {
            java.lang.String r0 = r2.getName()
            okhttp3.RequestBody r2 = getRequestBody(r2)
            okhttp3.MultipartBody$Part r1 = okhttp3.MultipartBody.Part.createFormData(r1, r0, r2)
            return r1
    }

    public static java.util.Map<java.lang.String, okhttp3.RequestBody> getFilePartMap(java.lang.String r6, java.util.List<java.io.File> r7) {
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r7.size()
            if (r1 >= r2) goto L3d
            java.lang.Object r2 = r7.get(r1)
            java.io.File r2 = (java.io.File) r2
            java.lang.String r3 = "image/png"
            okhttp3.MediaType r3 = okhttp3.MediaType.parse(r3)
            okhttp3.RequestBody r3 = okhttp3.RequestBody.create(r3, r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r1)
            java.lang.String r5 = "\"; filename=\""
            r4.append(r5)
            java.lang.String r2 = r2.getName()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.put(r2, r3)
            int r1 = r1 + 1
            goto L6
        L3d:
            return r0
    }

    public static okhttp3.RequestBody getRequestBody(java.io.File r1) {
            java.lang.String r0 = "image/png"
            okhttp3.MediaType r0 = okhttp3.MediaType.parse(r0)
            okhttp3.RequestBody r1 = okhttp3.RequestBody.create(r0, r1)
            return r1
    }

    public static okhttp3.RequestBody getRequestBody(java.lang.String r1) {
            java.lang.String r0 = "multipart/form-data"
            okhttp3.MediaType r0 = okhttp3.MediaType.parse(r0)
            okhttp3.RequestBody r1 = okhttp3.RequestBody.create(r0, r1)
            return r1
    }

    public static okhttp3.RequestBody getRequestBody2(java.io.File r1) {
            java.lang.String r0 = "json"
            okhttp3.MediaType r0 = okhttp3.MediaType.parse(r0)
            okhttp3.RequestBody r1 = okhttp3.RequestBody.create(r0, r1)
            return r1
    }
}
