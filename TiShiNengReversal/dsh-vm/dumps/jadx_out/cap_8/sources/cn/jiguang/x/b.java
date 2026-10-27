package cn.jiguang.x;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a(android.content.Context r6, java.lang.String r7, java.io.File r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "url is : "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = "\n fileName is : "
            r0.append(r1)
            java.lang.String r1 = r8.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "UploadLogUtils"
            cn.jiguang.w.f.c(r1, r0)
            r0 = 0
            r2 = 0
            long r3 = r8.length()     // Catch: java.lang.Throwable -> Lac
            int r4 = (int) r3     // Catch: java.lang.Throwable -> Lac
            byte[] r3 = new byte[r4]     // Catch: java.lang.Throwable -> Lac
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> Lac
            java.lang.String r5 = "r"
            r4.<init>(r8, r5)     // Catch: java.lang.Throwable -> Lac
            r4.read(r3)     // Catch: java.lang.Throwable -> La9
            cn.jiguang.net.HttpRequest r8 = new cn.jiguang.net.HttpRequest     // Catch: java.lang.Throwable -> La9
            r8.<init>(r7)     // Catch: java.lang.Throwable -> La9
            java.lang.String r7 = "Connection"
            java.lang.String r2 = "Keep-Alive"
            r8.setRequestProperty(r7, r2)     // Catch: java.lang.Throwable -> La9
            java.lang.String r7 = "Content-Type"
            java.lang.String r2 = "multipart/form-data"
            r8.setRequestProperty(r7, r2)     // Catch: java.lang.Throwable -> La9
            r8.setUseCaches(r0)     // Catch: java.lang.Throwable -> La9
            r7 = 1
            r8.setHaveRspData(r7)     // Catch: java.lang.Throwable -> La9
            r8.setDoInPut(r7)     // Catch: java.lang.Throwable -> La9
            r8.setDoOutPut(r7)     // Catch: java.lang.Throwable -> La9
            r8.setBody(r3)     // Catch: java.lang.Throwable -> La9
            cn.jiguang.net.HttpResponse r8 = cn.jiguang.net.HttpUtils.httpResponse(r6, r8, r0, r7)     // Catch: java.lang.Throwable -> La9
            int r2 = r8.getResponseCode()     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r3.<init>()     // Catch: java.lang.Throwable -> La9
            java.lang.String r5 = "response code is "
            r3.append(r5)     // Catch: java.lang.Throwable -> La9
            r3.append(r2)     // Catch: java.lang.Throwable -> La9
            java.lang.String r5 = ", response message is "
            r3.append(r5)     // Catch: java.lang.Throwable -> La9
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Throwable -> La9
            r3.append(r5)     // Catch: java.lang.Throwable -> La9
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> La9
            cn.jiguang.w.f.c(r1, r3)     // Catch: java.lang.Throwable -> La9
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L88
            cn.jiguang.av.x.a(r4)
            return r7
        L88:
            java.lang.String r7 = r8.getResponseBody()     // Catch: java.lang.Throwable -> La9
            java.lang.String r8 = ""
            cn.jiguang.w.b.a(r6, r0, r8, r7)     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r6.<init>()     // Catch: java.lang.Throwable -> La9
            java.lang.String r8 = "error response is : "
            r6.append(r8)     // Catch: java.lang.Throwable -> La9
            r6.append(r7)     // Catch: java.lang.Throwable -> La9
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> La9
            cn.jiguang.w.f.c(r1, r6)     // Catch: java.lang.Throwable -> La9
            cn.jiguang.av.x.a(r4)
            goto Lc8
        La9:
            r6 = move-exception
            r2 = r4
            goto Lad
        Lac:
            r6 = move-exception
        Lad:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc9
            r7.<init>()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r8 = "error message is : "
            r7.append(r8)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> Lc9
            r7.append(r6)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> Lc9
            cn.jiguang.w.f.c(r1, r6)     // Catch: java.lang.Throwable -> Lc9
            cn.jiguang.av.x.a(r2)
        Lc8:
            return r0
        Lc9:
            r6 = move-exception
            cn.jiguang.av.x.a(r2)
            throw r6
    }
}
