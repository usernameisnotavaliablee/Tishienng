package com.bykv.vk.component.ttvideo.mediakit.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AVMDLHTTPNetwork extends com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient {
    private static final int HTTP_TIME_OUT = 10;
    public static final com.bytedance.sdk.component.xt.j.oq JSON = null;
    private static com.bytedance.sdk.component.xt.j.vl mClient;
    private com.bytedance.sdk.component.xt.j.xt mCall;



    static {
            java.lang.String r0 = "application/json"
            com.bytedance.sdk.component.xt.j.oq r0 = com.bytedance.sdk.component.xt.j.oq.j(r0)
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHTTPNetwork.JSON = r0
            return
    }

    public AVMDLHTTPNetwork() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient
    public void cancel() {
            r1 = this;
            com.bytedance.sdk.component.xt.j.xt r0 = r1.mCall
            if (r0 == 0) goto Lf
            boolean r0 = r0.cw()
            if (r0 != 0) goto Lf
            com.bytedance.sdk.component.xt.j.xt r0 = r1.mCall
            r0.xt()
        Lf:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient
    public void startTask(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient.CompletionListener r8) {
            r5 = this;
            java.lang.Class<com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHTTPNetwork> r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHTTPNetwork.class
            monitor-enter(r0)
            com.bytedance.sdk.component.xt.j.vl r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHTTPNetwork.mClient     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L29
            com.bytedance.sdk.component.xt.j.vl r1 = new com.bytedance.sdk.component.xt.j.vl     // Catch: java.lang.Throwable -> L27
            r1.<init>()     // Catch: java.lang.Throwable -> L27
            com.bytedance.sdk.component.xt.j.vl$j r1 = r1.xt()     // Catch: java.lang.Throwable -> L27
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L27
            r3 = 10
            com.bytedance.sdk.component.xt.j.vl$j r1 = r1.j(r3, r2)     // Catch: java.lang.Throwable -> L27
            com.bytedance.sdk.component.xt.j.vl$j r1 = r1.cw(r3, r2)     // Catch: java.lang.Throwable -> L27
            com.bytedance.sdk.component.xt.j.vl$j r1 = r1.xt(r3, r2)     // Catch: java.lang.Throwable -> L27
            com.bytedance.sdk.component.xt.j.vl r1 = r1.j()     // Catch: java.lang.Throwable -> L27
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHTTPNetwork.mClient = r1     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r6 = move-exception
            goto L68
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            com.bytedance.sdk.component.xt.j.ws$j r0 = new com.bytedance.sdk.component.xt.j.ws$j
            r0.<init>()
            com.bytedance.sdk.component.xt.j.ws$j r6 = r0.j(r6)
            if (r7 == 0) goto L53
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L3d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r6.j(r1, r2)
            goto L3d
        L53:
            com.bytedance.sdk.component.xt.j.ws r6 = r6.xt()
            com.bytedance.sdk.component.xt.j.vl r7 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHTTPNetwork.mClient
            com.bytedance.sdk.component.xt.j.xt r6 = r7.j(r6)
            r5.mCall = r6
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHTTPNetwork$1 r7 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHTTPNetwork$1
            r7.<init>(r5, r8)
            r6.j(r7)
            return
        L68:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r6
    }

    @Override // com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient
    public void startTask(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7, org.json.JSONObject r8, int r9, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient.CompletionListener r10) {
            r5 = this;
            java.lang.Class<com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHTTPNetwork> r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHTTPNetwork.class
            monitor-enter(r0)
            com.bytedance.sdk.component.xt.j.vl r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHTTPNetwork.mClient     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L29
            com.bytedance.sdk.component.xt.j.vl r1 = new com.bytedance.sdk.component.xt.j.vl     // Catch: java.lang.Throwable -> L27
            r1.<init>()     // Catch: java.lang.Throwable -> L27
            com.bytedance.sdk.component.xt.j.vl$j r1 = r1.xt()     // Catch: java.lang.Throwable -> L27
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L27
            r3 = 10
            com.bytedance.sdk.component.xt.j.vl$j r1 = r1.j(r3, r2)     // Catch: java.lang.Throwable -> L27
            com.bytedance.sdk.component.xt.j.vl$j r1 = r1.cw(r3, r2)     // Catch: java.lang.Throwable -> L27
            com.bytedance.sdk.component.xt.j.vl$j r1 = r1.xt(r3, r2)     // Catch: java.lang.Throwable -> L27
            com.bytedance.sdk.component.xt.j.vl r1 = r1.j()     // Catch: java.lang.Throwable -> L27
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHTTPNetwork.mClient = r1     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r6 = move-exception
            goto L7e
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            com.bytedance.sdk.component.xt.j.ws$j r0 = new com.bytedance.sdk.component.xt.j.ws$j
            r0.<init>()
            com.bytedance.sdk.component.xt.j.ws$j r6 = r0.j(r6)
            if (r7 == 0) goto L59
            int r0 = r7.size()
            if (r0 <= 0) goto L59
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L43:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r6.xt(r1, r2)
            goto L43
        L59:
            r7 = 1
            if (r9 != r7) goto L69
            com.bytedance.sdk.component.xt.j.oq r7 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHTTPNetwork.JSON
            java.lang.String r8 = java.lang.String.valueOf(r8)
            com.bytedance.sdk.component.xt.j.az r7 = com.bytedance.sdk.component.xt.j.az.j(r7, r8)
            r6.j(r7)
        L69:
            com.bytedance.sdk.component.xt.j.vl r7 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHTTPNetwork.mClient
            com.bytedance.sdk.component.xt.j.ws r6 = r6.xt()
            com.bytedance.sdk.component.xt.j.xt r6 = r7.j(r6)
            r5.mCall = r6
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHTTPNetwork$2 r7 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHTTPNetwork$2
            r7.<init>(r5, r10)
            r6.j(r7)
            return
        L7e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r6
    }
}
