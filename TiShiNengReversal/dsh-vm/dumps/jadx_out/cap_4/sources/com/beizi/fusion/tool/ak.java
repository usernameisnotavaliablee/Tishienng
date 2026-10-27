package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ak {
    private static volatile com.beizi.fusion.tool.ak a;
    private java.util.Map<java.lang.String, java.lang.Long> b;

    public ak() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            return
    }

    public static com.beizi.fusion.tool.ak a() {
            com.beizi.fusion.tool.ak r0 = com.beizi.fusion.tool.ak.a
            if (r0 != 0) goto L19
            java.lang.Class<com.beizi.fusion.tool.ak> r0 = com.beizi.fusion.tool.ak.class
            monitor-enter(r0)
            com.beizi.fusion.tool.ak r1 = com.beizi.fusion.tool.ak.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.beizi.fusion.tool.ak r1 = new com.beizi.fusion.tool.ak     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.beizi.fusion.tool.ak.a = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.beizi.fusion.tool.ak r0 = com.beizi.fusion.tool.ak.a
            return r0
    }

    public void a(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Long> r0 = r1.b
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto Ld
            java.util.Map<java.lang.String, java.lang.Long> r0 = r1.b
            r0.remove(r2)
        Ld:
            return
    }

    public void a(java.lang.String r2, long r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Long> r0 = r1.b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.put(r2, r3)
            return
    }

    public long b(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Long> r0 = r2.b
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L15
            java.util.Map<java.lang.String, java.lang.Long> r0 = r2.b
            java.lang.Object r3 = r0.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r0 = r3.longValue()
            return r0
        L15:
            r0 = 0
            return r0
    }
}
