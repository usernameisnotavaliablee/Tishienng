package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class n3 {

    /* renamed from: b, reason: collision with root package name */
    public static com.acse.ottn.n3 f2525b;
    public com.tencent.mmkv.MMKV a;

    public n3(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.String r1 = r1.getPackageName()
            r0.append(r1)
            java.lang.String r1 = "_info"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            com.tencent.mmkv.MMKV r0 = r2.a
            if (r0 != 0) goto L2e
            java.lang.String r0 = "ID"
            r1 = 2
            com.tencent.mmkv.MMKV r0 = com.tencent.mmkv.MMKV.mmkvWithID(r0, r1)
            r2.a = r0
        L2e:
            java.util.Map r0 = r3.getAll()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L48
            com.tencent.mmkv.MMKV r0 = r2.a
            r0.importFromSharedPreferences(r3)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            android.content.SharedPreferences$Editor r3 = r3.clear()
            r3.apply()
        L48:
            return
    }

    public static synchronized com.acse.ottn.n3 a() {
            java.lang.Class<com.acse.ottn.n3> r0 = com.acse.ottn.n3.class
            monitor-enter(r0)
            android.content.Context r1 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto Lc
            monitor-exit(r0)
            r0 = 0
            return r0
        Lc:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.f2525b     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            com.acse.ottn.n3 r1 = new com.acse.ottn.n3     // Catch: java.lang.Throwable -> L1c
            android.content.Context r2 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1c
            com.acse.ottn.n3.f2525b = r1     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r1 = move-exception
            goto L22
        L1e:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.f2525b     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return r1
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
    }

    public long a(java.lang.String r4, java.lang.Long r5) {
            r3 = this;
            com.tencent.mmkv.MMKV r0 = r3.a
            long r1 = r5.longValue()
            long r4 = r0.decodeLong(r4, r1)
            return r4
    }

    public java.lang.String a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.tencent.mmkv.MMKV r0 = r1.a
            java.lang.String r2 = r0.decodeString(r2, r3)
            return r2
    }

    public void a(java.lang.String r2, int r3) {
            r1 = this;
            com.tencent.mmkv.MMKV r0 = r1.a
            r0.encode(r2, r3)
            return
    }

    public void a(java.lang.String r2, long r3) {
            r1 = this;
            com.tencent.mmkv.MMKV r0 = r1.a
            r0.encode(r2, r3)
            return
    }

    public void a(java.lang.String r2, java.lang.Boolean r3) {
            r1 = this;
            com.tencent.mmkv.MMKV r0 = r1.a
            boolean r3 = r3.booleanValue()
            r0.encode(r2, r3)
            return
    }

    public void a(java.lang.String r2, java.lang.Float r3) {
            r1 = this;
            com.tencent.mmkv.MMKV r0 = r1.a
            float r3 = r3.floatValue()
            r0.encode(r2, r3)
            return
    }

    public void a(java.lang.String r2, java.lang.String[] r3) {
            r1 = this;
            java.lang.String r3 = java.util.Arrays.toString(r3)
            com.tencent.mmkv.MMKV r0 = r1.a
            r0.encode(r2, r3)
            return
    }

    public boolean a(java.lang.String r3) {
            r2 = this;
            com.tencent.mmkv.MMKV r0 = r2.a
            r1 = 0
            boolean r3 = r0.decodeBool(r3, r1)
            return r3
    }

    public float b(java.lang.String r3) {
            r2 = this;
            com.tencent.mmkv.MMKV r0 = r2.a
            r1 = 0
            float r3 = r0.decodeFloat(r3, r1)
            return r3
    }

    public void b(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.tencent.mmkv.MMKV r0 = r1.a
            r0.encode(r2, r3)
            return
    }

    public int c(java.lang.String r3) {
            r2 = this;
            com.tencent.mmkv.MMKV r0 = r2.a
            r1 = 0
            int r3 = r0.decodeInt(r3, r1)
            return r3
    }

    public long d(java.lang.String r4) {
            r3 = this;
            com.tencent.mmkv.MMKV r0 = r3.a
            r1 = 0
            long r0 = r0.decodeLong(r4, r1)
            return r0
    }

    public java.lang.String e(java.lang.String r3) {
            r2 = this;
            com.tencent.mmkv.MMKV r0 = r2.a
            java.lang.String r1 = ""
            java.lang.String r3 = r0.decodeString(r3, r1)
            return r3
    }

    public java.lang.String[] f(java.lang.String r3) {
            r2 = this;
            com.tencent.mmkv.MMKV r0 = r2.a
            java.lang.String r1 = ""
            java.lang.String r3 = r0.decodeString(r3, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L1f
            int r0 = r3.length()
            r1 = 1
            int r0 = r0 - r1
            java.lang.String r3 = r3.substring(r1, r0)
            java.lang.String r0 = ","
            java.lang.String[] r3 = r3.split(r0)
            return r3
        L1f:
            r3 = 0
            return r3
    }
}
