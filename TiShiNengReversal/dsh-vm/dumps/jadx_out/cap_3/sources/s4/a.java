package s4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class a implements r4.a {
    private static volatile s4.a b;
    private t4.b a;

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static r4.a c() {
            s4.a r0 = s4.a.b
            if (r0 != 0) goto L19
            java.lang.Class<s4.a> r0 = s4.a.class
            monitor-enter(r0)
            s4.a r1 = s4.a.b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            s4.a r1 = new s4.a     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            s4.a.b = r1     // Catch: java.lang.Throwable -> L13
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
            s4.a r0 = s4.a.b
            return r0
    }

    @Override // r4.a
    public void a(java.lang.String r2) throws master.flame.danmaku.danmaku.loader.IllegalDataException {
            r1 = this;
            t4.b r0 = new t4.b     // Catch: java.lang.Exception -> Lc
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Exception -> Lc
            r0.<init>(r2)     // Catch: java.lang.Exception -> Lc
            r1.a = r0     // Catch: java.lang.Exception -> Lc
            return
        Lc:
            r2 = move-exception
            master.flame.danmaku.danmaku.loader.IllegalDataException r0 = new master.flame.danmaku.danmaku.loader.IllegalDataException
            r0.<init>(r2)
            throw r0
    }

    public t4.b b() {
            r1 = this;
            t4.b r0 = r1.a
            return r0
    }

    @Override // r4.a
    public /* bridge */ /* synthetic */ master.flame.danmaku.danmaku.parser.b getDataSource() {
            r1 = this;
            t4.b r0 = r1.b()
            return r0
    }

    @Override // r4.a
    public void load(java.io.InputStream r2) throws master.flame.danmaku.danmaku.loader.IllegalDataException {
            r1 = this;
            t4.b r0 = new t4.b     // Catch: java.lang.Exception -> L8
            r0.<init>(r2)     // Catch: java.lang.Exception -> L8
            r1.a = r0     // Catch: java.lang.Exception -> L8
            return
        L8:
            r2 = move-exception
            master.flame.danmaku.danmaku.loader.IllegalDataException r0 = new master.flame.danmaku.danmaku.loader.IllegalDataException
            r0.<init>(r2)
            throw r0
    }
}
