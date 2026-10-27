package xyz.adscope.common.network.cookie;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class DBCookieStore implements xyz.adscope.common.network.cookie.CookieStore, xyz.adscope.common.network.cookie.db.Field {
    private java.util.concurrent.locks.Lock a;
    private xyz.adscope.common.network.cookie.db.CookieDao b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.network.cookie.DBCookieStore$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        private android.content.Context a;

        private Builder(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        /* synthetic */ Builder(android.content.Context r1, xyz.adscope.common.network.cookie.DBCookieStore.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ android.content.Context a(xyz.adscope.common.network.cookie.DBCookieStore.Builder r0) {
                android.content.Context r0 = r0.a
                return r0
        }

        public xyz.adscope.common.network.cookie.DBCookieStore build() {
                r2 = this;
                xyz.adscope.common.network.cookie.DBCookieStore r0 = new xyz.adscope.common.network.cookie.DBCookieStore
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }
    }

    private DBCookieStore(xyz.adscope.common.network.cookie.DBCookieStore.Builder r4) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r3.a = r0
            xyz.adscope.common.network.cookie.db.CookieDao r0 = new xyz.adscope.common.network.cookie.db.CookieDao
            android.content.Context r4 = xyz.adscope.common.network.cookie.DBCookieStore.Builder.a(r4)
            r0.<init>(r4)
            r3.b = r0
            xyz.adscope.common.network.cookie.db.Where$Builder r4 = xyz.adscope.common.network.cookie.db.Where.newBuilder()
            xyz.adscope.common.network.cookie.db.Where$Options r0 = xyz.adscope.common.network.cookie.db.Where.Options.EQUAL
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EXPIRY"
            xyz.adscope.common.network.cookie.db.Where$Builder r4 = r4.add(r2, r0, r1)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            xyz.adscope.common.network.cookie.db.Where$Builder r4 = r4.or(r2, r0, r1)
            xyz.adscope.common.network.cookie.db.Where r4 = r4.build()
            xyz.adscope.common.network.cookie.db.CookieDao r0 = r3.b
            java.lang.String r4 = r4.toString()
            r0.delete(r4)
            return
    }

    /* synthetic */ DBCookieStore(xyz.adscope.common.network.cookie.DBCookieStore.Builder r1, xyz.adscope.common.network.cookie.DBCookieStore.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static java.net.URI a(java.net.URI r6) {
            java.net.URI r0 = new java.net.URI     // Catch: java.net.URISyntaxException -> L12
            java.lang.String r1 = "http"
            java.lang.String r2 = r6.getHost()     // Catch: java.net.URISyntaxException -> L12
            java.lang.String r3 = r6.getPath()     // Catch: java.net.URISyntaxException -> L12
            r4 = 0
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.net.URISyntaxException -> L12
            return r0
        L12:
            return r6
    }

    private void a() {
            r3 = this;
            xyz.adscope.common.network.cookie.db.CookieDao r0 = r3.b
            int r0 = r0.count()
            r1 = 888(0x378, float:1.244E-42)
            if (r0 <= r1) goto L1d
            xyz.adscope.common.network.cookie.db.CookieDao r2 = r3.b
            int r0 = r0 - r1
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r1 = 0
            java.util.List r0 = r2.getList(r1, r1, r0, r1)
            if (r0 == 0) goto L1d
            xyz.adscope.common.network.cookie.db.CookieDao r1 = r3.b
            r1.delete(r0)
        L1d:
            return
    }

    public static xyz.adscope.common.network.cookie.DBCookieStore.Builder newBuilder(android.content.Context r2) {
            xyz.adscope.common.network.cookie.DBCookieStore$Builder r0 = new xyz.adscope.common.network.cookie.DBCookieStore$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // xyz.adscope.common.network.cookie.CookieStore
    public void add(java.net.URI r2, java.net.HttpCookie r3) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.a
            r0.lock()
            if (r2 == 0) goto L25
            if (r3 == 0) goto L25
            java.net.URI r2 = a(r2)     // Catch: java.lang.Throwable -> L1e
            xyz.adscope.common.network.cookie.db.CookieDao r0 = r1.b     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1e
            xyz.adscope.common.network.cookie.Cookie r2 = xyz.adscope.common.network.cookie.Cookie.toCookie(r2, r3)     // Catch: java.lang.Throwable -> L1e
            r0.replace(r2)     // Catch: java.lang.Throwable -> L1e
            r1.a()     // Catch: java.lang.Throwable -> L1e
            goto L25
        L1e:
            r2 = move-exception
            java.util.concurrent.locks.Lock r3 = r1.a
            r3.unlock()
            throw r2
        L25:
            java.util.concurrent.locks.Lock r2 = r1.a
            r2.unlock()
            return
    }

    @Override // xyz.adscope.common.network.cookie.CookieStore
    public void clear() {
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.a
            r0.lock()
            xyz.adscope.common.network.cookie.db.CookieDao r0 = r2.b     // Catch: java.lang.Throwable -> L10
            r0.deleteAll()     // Catch: java.lang.Throwable -> L10
            java.util.concurrent.locks.Lock r0 = r2.a
            r0.unlock()
            return
        L10:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r2.a
            r1.unlock()
            throw r0
    }

    @Override // xyz.adscope.common.network.cookie.CookieStore
    public java.util.List<java.net.HttpCookie> get(java.net.URI r12) {
            r11 = this;
            java.lang.String r0 = "/"
            java.lang.String r1 = "."
            java.lang.String r2 = "PATH"
            java.lang.String r3 = "DOMAIN"
            java.util.concurrent.locks.Lock r4 = r11.a
            r4.lock()
            java.net.URI r12 = a(r12)     // Catch: java.lang.Throwable -> L5a
            xyz.adscope.common.network.cookie.db.Where$Builder r4 = xyz.adscope.common.network.cookie.db.Where.newBuilder()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r5 = r12.getHost()     // Catch: java.lang.Throwable -> L5a
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L5a
            if (r6 != 0) goto L7d
            xyz.adscope.common.network.cookie.db.Where$Builder r6 = xyz.adscope.common.network.cookie.db.Where.newBuilder()     // Catch: java.lang.Throwable -> L5a
            xyz.adscope.common.network.cookie.db.Where$Options r7 = xyz.adscope.common.network.cookie.db.Where.Options.EQUAL     // Catch: java.lang.Throwable -> L5a
            xyz.adscope.common.network.cookie.db.Where$Builder r6 = r6.add(r3, r7, r5)     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r8.<init>()     // Catch: java.lang.Throwable -> L5a
            r8.append(r1)     // Catch: java.lang.Throwable -> L5a
            r8.append(r5)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L5a
            xyz.adscope.common.network.cookie.db.Where$Builder r6 = r6.or(r3, r7, r8)     // Catch: java.lang.Throwable -> L5a
            int r8 = r5.indexOf(r1)     // Catch: java.lang.Throwable -> L5a
            int r1 = r5.lastIndexOf(r1)     // Catch: java.lang.Throwable -> L5a
            if (r8 <= 0) goto L72
            if (r1 <= r8) goto L5d
            int r9 = r5.length()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r9 = r5.substring(r8, r9)     // Catch: java.lang.Throwable -> L5a
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L5a
            if (r10 != 0) goto L5d
            r6.or(r3, r7, r9)     // Catch: java.lang.Throwable -> L5a
            goto L5d
        L5a:
            r12 = move-exception
            goto Lfb
        L5d:
            int r8 = r8 + 1
            if (r1 <= r8) goto L72
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = r5.substring(r8, r1)     // Catch: java.lang.Throwable -> L5a
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L5a
            if (r5 != 0) goto L72
            r6.or(r3, r7, r1)     // Catch: java.lang.Throwable -> L5a
        L72:
            xyz.adscope.common.network.cookie.db.Where r1 = r6.build()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5a
            r4.set(r1)     // Catch: java.lang.Throwable -> L5a
        L7d:
            java.lang.String r1 = r12.getPath()     // Catch: java.lang.Throwable -> L5a
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L5a
            if (r3 != 0) goto Lb8
            xyz.adscope.common.network.cookie.db.Where$Builder r3 = xyz.adscope.common.network.cookie.db.Where.newBuilder()     // Catch: java.lang.Throwable -> L5a
            xyz.adscope.common.network.cookie.db.Where$Options r5 = xyz.adscope.common.network.cookie.db.Where.Options.EQUAL     // Catch: java.lang.Throwable -> L5a
            xyz.adscope.common.network.cookie.db.Where$Builder r3 = r3.add(r2, r5, r1)     // Catch: java.lang.Throwable -> L5a
            xyz.adscope.common.network.cookie.db.Where$Builder r3 = r3.or(r2, r5, r0)     // Catch: java.lang.Throwable -> L5a
            xyz.adscope.common.network.cookie.db.Where$Builder r3 = r3.orNull(r2)     // Catch: java.lang.Throwable -> L5a
            int r5 = r1.lastIndexOf(r0)     // Catch: java.lang.Throwable -> L5a
        L9d:
            if (r5 <= 0) goto Lae
            r6 = 0
            java.lang.String r1 = r1.substring(r6, r5)     // Catch: java.lang.Throwable -> L5a
            xyz.adscope.common.network.cookie.db.Where$Options r5 = xyz.adscope.common.network.cookie.db.Where.Options.EQUAL     // Catch: java.lang.Throwable -> L5a
            r3.or(r2, r5, r1)     // Catch: java.lang.Throwable -> L5a
            int r5 = r1.lastIndexOf(r0)     // Catch: java.lang.Throwable -> L5a
            goto L9d
        Lae:
            r3.bracket()     // Catch: java.lang.Throwable -> L5a
            xyz.adscope.common.network.cookie.db.Where r0 = r3.build()     // Catch: java.lang.Throwable -> L5a
            r4.and(r0)     // Catch: java.lang.Throwable -> L5a
        Lb8:
            java.lang.String r0 = "URL"
            xyz.adscope.common.network.cookie.db.Where$Options r1 = xyz.adscope.common.network.cookie.db.Where.Options.EQUAL     // Catch: java.lang.Throwable -> L5a
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L5a
            r4.or(r0, r1, r12)     // Catch: java.lang.Throwable -> L5a
            xyz.adscope.common.network.cookie.db.Where r12 = r4.build()     // Catch: java.lang.Throwable -> L5a
            xyz.adscope.common.network.cookie.db.CookieDao r0 = r11.b     // Catch: java.lang.Throwable -> L5a
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L5a
            r1 = 0
            java.util.List r12 = r0.getList(r12, r1, r1, r1)     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5a
            r0.<init>()     // Catch: java.lang.Throwable -> L5a
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L5a
        Ldb:
            boolean r1 = r12.hasNext()     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto Lf5
            java.lang.Object r1 = r12.next()     // Catch: java.lang.Throwable -> L5a
            xyz.adscope.common.network.cookie.Cookie r1 = (xyz.adscope.common.network.cookie.Cookie) r1     // Catch: java.lang.Throwable -> L5a
            boolean r2 = xyz.adscope.common.network.cookie.Cookie.isExpired(r1)     // Catch: java.lang.Throwable -> L5a
            if (r2 != 0) goto Ldb
            java.net.HttpCookie r1 = xyz.adscope.common.network.cookie.Cookie.toHttpCookie(r1)     // Catch: java.lang.Throwable -> L5a
            r0.add(r1)     // Catch: java.lang.Throwable -> L5a
            goto Ldb
        Lf5:
            java.util.concurrent.locks.Lock r12 = r11.a
            r12.unlock()
            return r0
        Lfb:
            java.util.concurrent.locks.Lock r0 = r11.a
            r0.unlock()
            throw r12
    }

    @Override // xyz.adscope.common.network.cookie.CookieStore
    public void remove(java.net.HttpCookie r5) {
            r4 = this;
            java.util.concurrent.locks.Lock r0 = r4.a
            r0.lock()
            xyz.adscope.common.network.cookie.db.Where$Builder r0 = xyz.adscope.common.network.cookie.db.Where.newBuilder()     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "NAME"
            xyz.adscope.common.network.cookie.db.Where$Options r2 = xyz.adscope.common.network.cookie.db.Where.Options.EQUAL     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = r5.getName()     // Catch: java.lang.Throwable -> L25
            xyz.adscope.common.network.cookie.db.Where$Builder r0 = r0.add(r1, r2, r3)     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = r5.getDomain()     // Catch: java.lang.Throwable -> L25
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L25
            if (r3 != 0) goto L27
            java.lang.String r3 = "DOMAIN"
            r0.and(r3, r2, r1)     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r5 = move-exception
            goto L62
        L27:
            java.lang.String r5 = r5.getPath()     // Catch: java.lang.Throwable -> L25
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L4f
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L25
            r3 = 1
            if (r1 <= r3) goto L4a
            java.lang.String r1 = "/"
            boolean r1 = r5.endsWith(r1)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L4a
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L25
            int r1 = r1 - r3
            r3 = 0
            java.lang.String r5 = r5.substring(r3, r1)     // Catch: java.lang.Throwable -> L25
        L4a:
            java.lang.String r1 = "PATH"
            r0.and(r1, r2, r5)     // Catch: java.lang.Throwable -> L25
        L4f:
            xyz.adscope.common.network.cookie.db.CookieDao r5 = r4.b     // Catch: java.lang.Throwable -> L25
            xyz.adscope.common.network.cookie.db.Where r0 = r0.build()     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L25
            r5.delete(r0)     // Catch: java.lang.Throwable -> L25
            java.util.concurrent.locks.Lock r5 = r4.a
            r5.unlock()
            return
        L62:
            java.util.concurrent.locks.Lock r0 = r4.a
            r0.unlock()
            throw r5
    }
}
