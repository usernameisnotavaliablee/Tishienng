package master.flame.danmaku.danmaku.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface m {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements java.util.Comparator<master.flame.danmaku.danmaku.model.d> {
        protected boolean a;

        public a(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.b(r1)
                return
        }

        public int a(master.flame.danmaku.danmaku.model.d r2, master.flame.danmaku.danmaku.model.d r3) {
                r1 = this;
                boolean r0 = r1.a
                if (r0 == 0) goto Lc
                boolean r0 = v4.a.g(r2, r3)
                if (r0 == 0) goto Lc
                r2 = 0
                return r2
            Lc:
                int r2 = v4.a.d(r2, r3)
                return r2
        }

        public void b(boolean r1) {
                r0 = this;
                r0.a = r1
                return
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(master.flame.danmaku.danmaku.model.d r1, master.flame.danmaku.danmaku.model.d r2) {
                r0 = this;
                master.flame.danmaku.danmaku.model.d r1 = (master.flame.danmaku.danmaku.model.d) r1
                master.flame.danmaku.danmaku.model.d r2 = (master.flame.danmaku.danmaku.model.d) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class b<Progress, Result> {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract int a(Progress r1);

        public void b() {
                r0 = this;
                return
        }

        public void c() {
                r0 = this;
                return
        }

        public Result d() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class c<Progress> extends master.flame.danmaku.danmaku.model.m.b<Progress, java.lang.Void> {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class d extends master.flame.danmaku.danmaku.model.m.a {
        public d(boolean r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // master.flame.danmaku.danmaku.model.m.a
        public int a(master.flame.danmaku.danmaku.model.d r1, master.flame.danmaku.danmaku.model.d r2) {
                r0 = this;
                int r1 = super.a(r1, r2)
                return r1
        }

        @Override // master.flame.danmaku.danmaku.model.m.a, java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(master.flame.danmaku.danmaku.model.d r1, master.flame.danmaku.danmaku.model.d r2) {
                r0 = this;
                master.flame.danmaku.danmaku.model.d r1 = (master.flame.danmaku.danmaku.model.d) r1
                master.flame.danmaku.danmaku.model.d r2 = (master.flame.danmaku.danmaku.model.d) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class e extends master.flame.danmaku.danmaku.model.m.a {
        public e(boolean r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // master.flame.danmaku.danmaku.model.m.a
        public int a(master.flame.danmaku.danmaku.model.d r2, master.flame.danmaku.danmaku.model.d r3) {
                r1 = this;
                boolean r0 = r1.a
                if (r0 == 0) goto Lc
                boolean r0 = v4.a.g(r2, r3)
                if (r0 == 0) goto Lc
                r2 = 0
                return r2
            Lc:
                float r2 = r2.l()
                float r3 = r3.l()
                int r2 = java.lang.Float.compare(r2, r3)
                return r2
        }

        @Override // master.flame.danmaku.danmaku.model.m.a, java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(master.flame.danmaku.danmaku.model.d r1, master.flame.danmaku.danmaku.model.d r2) {
                r0 = this;
                master.flame.danmaku.danmaku.model.d r1 = (master.flame.danmaku.danmaku.model.d) r1
                master.flame.danmaku.danmaku.model.d r2 = (master.flame.danmaku.danmaku.model.d) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class f extends master.flame.danmaku.danmaku.model.m.a {
        public f(boolean r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // master.flame.danmaku.danmaku.model.m.a
        public int a(master.flame.danmaku.danmaku.model.d r2, master.flame.danmaku.danmaku.model.d r3) {
                r1 = this;
                boolean r0 = r1.a
                if (r0 == 0) goto Lc
                boolean r0 = v4.a.g(r2, r3)
                if (r0 == 0) goto Lc
                r2 = 0
                return r2
            Lc:
                float r3 = r3.l()
                float r2 = r2.l()
                int r2 = java.lang.Float.compare(r3, r2)
                return r2
        }

        @Override // master.flame.danmaku.danmaku.model.m.a, java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(master.flame.danmaku.danmaku.model.d r1, master.flame.danmaku.danmaku.model.d r2) {
                r0 = this;
                master.flame.danmaku.danmaku.model.d r1 = (master.flame.danmaku.danmaku.model.d) r1
                master.flame.danmaku.danmaku.model.d r2 = (master.flame.danmaku.danmaku.model.d) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    void a(master.flame.danmaku.danmaku.model.m.b<? super master.flame.danmaku.danmaku.model.d, ?> r1);

    void b(boolean r1);

    java.lang.Object c();

    void clear();

    master.flame.danmaku.danmaku.model.m d(long r1, long r3);

    boolean e(master.flame.danmaku.danmaku.model.d r1);

    void f(master.flame.danmaku.danmaku.model.m.b<? super master.flame.danmaku.danmaku.model.d, ?> r1);

    master.flame.danmaku.danmaku.model.d first();

    boolean g(master.flame.danmaku.danmaku.model.d r1);

    java.util.Collection<master.flame.danmaku.danmaku.model.d> h();

    master.flame.danmaku.danmaku.model.m i(long r1, long r3);

    boolean isEmpty();

    boolean j(master.flame.danmaku.danmaku.model.d r1);

    master.flame.danmaku.danmaku.model.d last();

    int size();
}
