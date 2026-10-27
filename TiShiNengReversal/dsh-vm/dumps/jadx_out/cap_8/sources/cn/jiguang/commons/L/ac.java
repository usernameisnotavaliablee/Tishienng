package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ac {
    private android.content.SharedPreferences a;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.locks.ReentrantReadWriteLock f855c;

    /* renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock f856d;

    /* renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock f857e;

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class b {
        private static final cn.jiguang.commons.L.ac a = null;

        static {
                cn.jiguang.commons.L.ac r0 = new cn.jiguang.commons.L.ac
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.L.ac.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.L.ac a() {
                cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.b.a
                return r0
        }
    }

    private ac() {
            r3 = this;
            r3.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r3.f855c = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r3.f856d = r1
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r3.f857e = r0
            android.content.Context r0 = cn.jiguang.commons.L.h.a()
            java.lang.String r1 = "app_prefs"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.a = r0
            return
    }

    /* synthetic */ ac(cn.jiguang.commons.L.ac.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.commons.L.ac a() {
            cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.b.a()
            return r0
    }

    public int a(java.lang.String r2, int r3) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.f856d
            r0.lock()
            android.content.SharedPreferences r0 = r1.a     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = cn.jiguang.commons.L.ad.a(r2)     // Catch: java.lang.Throwable -> L15
            int r2 = r0.getInt(r2, r3)     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.f856d
            r3.unlock()
            return r2
        L15:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.f856d
            r3.unlock()
            throw r2
    }

    public long a(java.lang.String r2, long r3) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.f856d
            r0.lock()
            android.content.SharedPreferences r0 = r1.a     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = cn.jiguang.commons.L.ad.a(r2)     // Catch: java.lang.Throwable -> L15
            long r2 = r0.getLong(r2, r3)     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.f856d
            r4.unlock()
            return r2
        L15:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.f856d
            r3.unlock()
            throw r2
    }

    public java.lang.String a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.f856d
            r0.lock()
            android.content.SharedPreferences r0 = r1.a     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = cn.jiguang.commons.L.ad.a(r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = r0.getString(r2, r3)     // Catch: java.lang.Throwable -> L1a
            boolean r3 = android.text.TextUtils.equals(r2, r3)     // Catch: java.lang.Throwable -> L1a
            if (r3 != 0) goto L1c
            java.lang.String r2 = cn.jiguang.commons.L.ad.a(r2)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r2 = move-exception
            goto L22
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.f856d
            r3.unlock()
            return r2
        L22:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.f856d
            r3.unlock()
            throw r2
    }

    public void a(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r1.f857e
            r0.lock()
            android.content.SharedPreferences r0 = r1.a     // Catch: java.lang.Throwable -> L18
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L18
            android.content.SharedPreferences$Editor r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L18
            r2.apply()     // Catch: java.lang.Throwable -> L18
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r1.f857e
            r2.unlock()
            return
        L18:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r1.f857e
            r0.unlock()
            throw r2
    }

    public void c(java.lang.String r2, int r3) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r1.f857e
            r0.lock()
            android.content.SharedPreferences r0 = r1.a     // Catch: java.lang.Throwable -> L1c
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = cn.jiguang.commons.L.ad.a(r2)     // Catch: java.lang.Throwable -> L1c
            android.content.SharedPreferences$Editor r2 = r0.putInt(r2, r3)     // Catch: java.lang.Throwable -> L1c
            r2.apply()     // Catch: java.lang.Throwable -> L1c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r1.f857e
            r2.unlock()
            return
        L1c:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r1.f857e
            r3.unlock()
            throw r2
    }

    public void c(java.lang.String r2, long r3) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r1.f857e
            r0.lock()
            android.content.SharedPreferences r0 = r1.a     // Catch: java.lang.Throwable -> L1c
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = cn.jiguang.commons.L.ad.a(r2)     // Catch: java.lang.Throwable -> L1c
            android.content.SharedPreferences$Editor r2 = r0.putLong(r2, r3)     // Catch: java.lang.Throwable -> L1c
            r2.apply()     // Catch: java.lang.Throwable -> L1c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r1.f857e
            r2.unlock()
            return
        L1c:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r1.f857e
            r3.unlock()
            throw r2
    }

    public void c(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r1.f857e
            r0.lock()
            java.lang.String r2 = cn.jiguang.commons.L.ad.a(r2)     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = cn.jiguang.commons.L.ad.a(r3)     // Catch: java.lang.Throwable -> L20
            android.content.SharedPreferences r0 = r1.a     // Catch: java.lang.Throwable -> L20
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L20
            android.content.SharedPreferences$Editor r2 = r0.putString(r2, r3)     // Catch: java.lang.Throwable -> L20
            r2.apply()     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r1.f857e
            r2.unlock()
            return
        L20:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r1.f857e
            r3.unlock()
            throw r2
    }
}
