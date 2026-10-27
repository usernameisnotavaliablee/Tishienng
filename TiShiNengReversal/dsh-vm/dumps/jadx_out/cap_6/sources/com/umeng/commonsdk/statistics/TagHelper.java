package com.umeng.commonsdk.statistics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class TagHelper {
    private static java.lang.Object lock;
    private static java.util.Map<java.lang.String, java.lang.String> moduleTags;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.commonsdk.statistics.TagHelper.lock = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.commonsdk.statistics.TagHelper.moduleTags = r0
            return
    }

    public TagHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void deleteModuleTag(java.lang.String r2) {
            java.lang.Object r0 = com.umeng.commonsdk.statistics.TagHelper.lock
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = com.umeng.commonsdk.statistics.TagHelper.moduleTags     // Catch: java.lang.Throwable -> L10
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L10
            java.util.Map<java.lang.String, java.lang.String> r1 = com.umeng.commonsdk.statistics.TagHelper.moduleTags     // Catch: java.lang.Throwable -> L10
            r1.remove(r2)     // Catch: java.lang.Throwable -> L10
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    public static java.util.Map<java.lang.String, java.lang.String> getModuleTags() {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Object r1 = com.umeng.commonsdk.statistics.TagHelper.lock
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.String> r2 = com.umeng.commonsdk.statistics.TagHelper.moduleTags     // Catch: java.lang.Throwable -> L36
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L36
            if (r2 <= 0) goto L36
            java.util.Map<java.lang.String, java.lang.String> r2 = com.umeng.commonsdk.statistics.TagHelper.moduleTags     // Catch: java.lang.Throwable -> L36
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L36
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L36
        L1a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L36
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L36
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L36
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L36
            r0.put(r4, r3)     // Catch: java.lang.Throwable -> L36
            goto L1a
        L36:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L38
            return r0
        L38:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L38
            throw r0
    }

    public static void setModuleTag(java.lang.String r3, java.lang.String r4) {
            java.lang.Object r0 = com.umeng.commonsdk.statistics.TagHelper.lock
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = com.umeng.commonsdk.statistics.TagHelper.moduleTags     // Catch: java.lang.Throwable -> L1e
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1e
            r2 = 30
            if (r1 < r2) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r3 = move-exception
            goto L20
        L11:
            java.util.Map<java.lang.String, java.lang.String> r1 = com.umeng.commonsdk.statistics.TagHelper.moduleTags     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L1e
            java.util.Map<java.lang.String, java.lang.String> r1 = com.umeng.commonsdk.statistics.TagHelper.moduleTags     // Catch: java.lang.Throwable -> L1e
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L1e
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }
}
