package com.bykv.vk.component.ttvideo.mediakit.downloader;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AVMDLHttpExcutor {
    private static final java.lang.String TAG = "AVMDLHttpExcutor";
    private static com.bytedance.sdk.component.xt.j.vl okHttpClient;

    public AVMDLHttpExcutor() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String buildRangeHeader(long r0, long r2) {
            java.lang.String r0 = formRangeStrBySize(r0, r2)
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r1 = "bytes="
            java.lang.String r0 = r1.concat(r0)
            return r0
    }

    @android.annotation.SuppressLint({"CI_DefaultLocale"})
    public static com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLResponse excute(com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLRequest r7, int r8) throws java.io.IOException {
            com.bytedance.sdk.component.xt.j.ws$j r0 = new com.bytedance.sdk.component.xt.j.ws$j
            r0.<init>()
            java.lang.String[] r1 = r7.urls
            r1 = r1[r8]
            r0.j(r1)
            java.lang.String r1 = "GET"
            r2 = 0
            r0.j(r1, r2)
            com.bytedance.sdk.component.xt.j.m r1 = toOkHttpHeaders(r7)
            r0.j(r1)
            com.bytedance.sdk.component.xt.j.vl r1 = getOkHttpClient()
            com.bytedance.sdk.component.xt.j.ws r0 = r0.xt()
            com.bytedance.sdk.component.xt.j.xt r0 = r1.j(r0)
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L50
            com.bytedance.sdk.component.xt.j.av r3 = r0.j()     // Catch: java.lang.Exception -> L50
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L50
            r7.mCurlUrlIndex = r8     // Catch: java.lang.Exception -> L50
            java.lang.String r6 = "http open cost time:%d url:%s"
            long r4 = r4 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L50
            java.lang.String[] r2 = r7.urls     // Catch: java.lang.Exception -> L50
            r8 = r2[r8]     // Catch: java.lang.Exception -> L50
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L50
            r4 = 0
            r2[r4] = r1     // Catch: java.lang.Exception -> L50
            r1 = 1
            r2[r1] = r8     // Catch: java.lang.Exception -> L50
            java.lang.String.format(r6, r2)     // Catch: java.lang.Exception -> L50
            com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLResponse r8 = new com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLResponse     // Catch: java.lang.Exception -> L50
            r8.<init>(r7, r3, r0)     // Catch: java.lang.Exception -> L50
            return r8
        L50:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "request exception is "
            r8.<init>(r0)
            java.lang.String r0 = r7.getLocalizedMessage()
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "AVMDLHttpExcutor"
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLLog.e(r0, r8)
            throw r7
    }

    public static java.lang.String formRangeStrByPos(long r5, long r7) {
            java.lang.String r0 = "-"
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 < 0) goto L1f
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 <= 0) goto L1f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r0)
            r1.append(r7)
            java.lang.String r5 = r1.toString()
            return r5
        L1f:
            if (r3 < 0) goto L31
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r0)
            java.lang.String r5 = r7.toString()
            return r5
        L31:
            if (r3 >= 0) goto L40
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 <= 0) goto L40
            java.lang.String r5 = java.lang.String.valueOf(r7)
            java.lang.String r5 = r0.concat(r5)
            return r5
        L40:
            r5 = 0
            return r5
    }

    public static java.lang.String formRangeStrBySize(long r3, long r5) {
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lb
            long r5 = r5 + r3
            r0 = 1
            long r5 = r5 - r0
            goto Ld
        Lb:
            r5 = -1
        Ld:
            java.lang.String r3 = formRangeStrByPos(r3, r5)
            return r3
    }

    private static synchronized com.bytedance.sdk.component.xt.j.vl getOkHttpClient() {
            java.lang.Class<com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLHttpExcutor> r0 = com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLHttpExcutor.class
            monitor-enter(r0)
            com.bytedance.sdk.component.xt.j.vl r1 = com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLHttpExcutor.okHttpClient     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L4b
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r1 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.getInstance()     // Catch: java.lang.Throwable -> L27
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r1 = r1.getConfig()     // Catch: java.lang.Throwable -> L27
            r2 = 10000(0x2710, double:4.9407E-320)
            if (r1 == 0) goto L29
            int r4 = r1.mOpenTimeOut     // Catch: java.lang.Throwable -> L27
            if (r4 <= 0) goto L1b
            int r4 = r4 * 1000
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L27
            goto L1c
        L1b:
            r4 = r2
        L1c:
            int r1 = r1.mRWTimeOut     // Catch: java.lang.Throwable -> L27
            if (r1 <= 0) goto L23
            int r1 = r1 * 1000
            long r2 = (long) r1     // Catch: java.lang.Throwable -> L27
        L23:
            r7 = r4
            r4 = r2
            r2 = r7
            goto L2a
        L27:
            r1 = move-exception
            goto L4f
        L29:
            r4 = r2
        L2a:
            com.bytedance.sdk.component.xt.j.vl$j r1 = new com.bytedance.sdk.component.xt.j.vl$j     // Catch: java.lang.Throwable -> L27
            r1.<init>()     // Catch: java.lang.Throwable -> L27
            com.bytedance.sdk.component.xt.j.jy r6 = com.bytedance.sdk.component.xt.j.jy.xt     // Catch: java.lang.Throwable -> L27
            java.util.List r6 = java.util.Collections.singletonList(r6)     // Catch: java.lang.Throwable -> L27
            r1.j(r6)     // Catch: java.lang.Throwable -> L27
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L27
            com.bytedance.sdk.component.xt.j.vl$j r2 = r1.j(r2, r6)     // Catch: java.lang.Throwable -> L27
            com.bytedance.sdk.component.xt.j.vl$j r2 = r2.xt(r4, r6)     // Catch: java.lang.Throwable -> L27
            r2.cw(r4, r6)     // Catch: java.lang.Throwable -> L27
            com.bytedance.sdk.component.xt.j.vl r1 = r1.j()     // Catch: java.lang.Throwable -> L27
            com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLHttpExcutor.okHttpClient = r1     // Catch: java.lang.Throwable -> L27
        L4b:
            com.bytedance.sdk.component.xt.j.vl r1 = com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLHttpExcutor.okHttpClient     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)
            return r1
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r1
    }

    private static com.bytedance.sdk.component.xt.j.m toOkHttpHeaders(com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLRequest r5) {
            com.bytedance.sdk.component.xt.j.m$j r0 = new com.bytedance.sdk.component.xt.j.m$j
            r0.<init>()
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r5.headers
            if (r1 == 0) goto L33
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            r2.getKey()
            r2.getValue()
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r0.xt(r3, r2)
            goto L11
        L33:
            long r1 = r5.reqOff
            long r3 = r5.size
            java.lang.String r5 = buildRangeHeader(r1, r3)
            if (r5 == 0) goto L42
            java.lang.String r1 = "Range"
            r0.xt(r1, r5)
        L42:
            java.lang.String r5 = "Accept-Encoding"
            java.lang.String r1 = "identity"
            r0.xt(r5, r1)
            com.bytedance.sdk.component.xt.j.m r5 = r0.j()
            return r5
    }
}
