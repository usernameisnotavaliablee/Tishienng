package com.alibaba.fastjson.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ServiceLoader {
    private static final java.lang.String PREFIX = "META-INF/services/";
    private static final java.util.Set<java.lang.String> loadedUrls = null;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.alibaba.fastjson.util.ServiceLoader.loadedUrls = r0
            return
    }

    public ServiceLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> java.util.Set<T> load(java.lang.Class<T> r5, java.lang.ClassLoader r6) {
            if (r6 != 0) goto L5
            java.util.Set r5 = java.util.Collections.EMPTY_SET
            return r5
        L5:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "META-INF/services/"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Enumeration r5 = r6.getResources(r5)     // Catch: java.io.IOException -> L4c
        L28:
            boolean r2 = r5.hasMoreElements()     // Catch: java.io.IOException -> L4c
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r5.nextElement()     // Catch: java.io.IOException -> L4c
            java.net.URL r2 = (java.net.URL) r2     // Catch: java.io.IOException -> L4c
            java.util.Set<java.lang.String> r3 = com.alibaba.fastjson.util.ServiceLoader.loadedUrls     // Catch: java.io.IOException -> L4c
            java.lang.String r4 = r2.toString()     // Catch: java.io.IOException -> L4c
            boolean r4 = r3.contains(r4)     // Catch: java.io.IOException -> L4c
            if (r4 == 0) goto L41
            goto L28
        L41:
            load(r2, r1)     // Catch: java.io.IOException -> L4c
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L4c
            r3.add(r2)     // Catch: java.io.IOException -> L4c
            goto L28
        L4c:
            java.util.Iterator r5 = r1.iterator()
        L50:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class r1 = r6.loadClass(r1)     // Catch: java.lang.Exception -> L68
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Exception -> L68
            r0.add(r1)     // Catch: java.lang.Exception -> L68
            goto L50
        L68:
            goto L50
        L6a:
            return r0
    }

    public static void load(java.net.URL r4, java.util.Set<java.lang.String> r5) throws java.io.IOException {
            r0 = 0
            java.io.InputStream r4 = r4.openStream()     // Catch: java.lang.Throwable -> L40
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3e
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "utf-8"
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3e
        L11:
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L1e
            com.alibaba.fastjson.util.IOUtils.close(r1)
            com.alibaba.fastjson.util.IOUtils.close(r4)
            return
        L1e:
            r2 = 35
            int r2 = r0.indexOf(r2)     // Catch: java.lang.Throwable -> L2c
            if (r2 < 0) goto L2f
            r3 = 0
            java.lang.String r0 = r0.substring(r3, r2)     // Catch: java.lang.Throwable -> L2c
            goto L2f
        L2c:
            r5 = move-exception
            r0 = r1
            goto L42
        L2f:
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L2c
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L2c
            if (r2 != 0) goto L3a
            goto L11
        L3a:
            r5.add(r0)     // Catch: java.lang.Throwable -> L2c
            goto L11
        L3e:
            r5 = move-exception
            goto L42
        L40:
            r5 = move-exception
            r4 = r0
        L42:
            com.alibaba.fastjson.util.IOUtils.close(r0)
            com.alibaba.fastjson.util.IOUtils.close(r4)
            throw r5
    }
}
