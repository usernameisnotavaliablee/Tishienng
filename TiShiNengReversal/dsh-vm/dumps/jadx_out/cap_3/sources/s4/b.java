package s4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class b implements r4.a {
    private static s4.b b;
    private t4.a a;

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static s4.b c() {
            s4.b r0 = s4.b.b
            if (r0 != 0) goto Lb
            s4.b r0 = new s4.b
            r0.<init>()
            s4.b.b = r0
        Lb:
            s4.b r0 = s4.b.b
            return r0
    }

    @Override // r4.a
    public void a(java.lang.String r2) throws master.flame.danmaku.danmaku.loader.IllegalDataException {
            r1 = this;
            t4.a r0 = new t4.a     // Catch: java.lang.Exception -> L8
            r0.<init>(r2)     // Catch: java.lang.Exception -> L8
            r1.a = r0     // Catch: java.lang.Exception -> L8
            return
        L8:
            r2 = move-exception
            master.flame.danmaku.danmaku.loader.IllegalDataException r0 = new master.flame.danmaku.danmaku.loader.IllegalDataException
            r0.<init>(r2)
            throw r0
    }

    public t4.a b() {
            r1 = this;
            t4.a r0 = r1.a
            return r0
    }

    @Override // r4.a
    public /* bridge */ /* synthetic */ master.flame.danmaku.danmaku.parser.b getDataSource() {
            r1 = this;
            t4.a r0 = r1.b()
            return r0
    }

    @Override // r4.a
    public void load(java.io.InputStream r2) {
            r1 = this;
            t4.a r0 = new t4.a
            r0.<init>(r2)
            r1.a = r0
            return
    }
}
