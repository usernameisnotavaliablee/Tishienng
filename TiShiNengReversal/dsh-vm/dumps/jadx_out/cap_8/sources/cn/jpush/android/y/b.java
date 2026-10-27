package cn.jpush.android.y;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b extends dalvik.system.DexClassLoader {
    private java.lang.ClassLoader a;

    public b(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.ClassLoader r5) {
            r1 = this;
            java.lang.Class<dalvik.system.DexClassLoader> r0 = dalvik.system.DexClassLoader.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1.<init>(r2, r3, r4, r0)
            r1.a = r5
            return
    }

    @Override // java.lang.ClassLoader
    public java.lang.Class<?> loadClass(java.lang.String r4) {
            r3 = this;
            java.lang.Class r4 = super.loadClass(r4)     // Catch: java.lang.ClassNotFoundException -> L5
            return r4
        L5:
            java.lang.ClassLoader r0 = r3.a     // Catch: java.lang.Throwable -> Lc
            java.lang.Class r4 = r0.loadClass(r4)     // Catch: java.lang.Throwable -> Lc
            return r4
        Lc:
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "jpush not found "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
