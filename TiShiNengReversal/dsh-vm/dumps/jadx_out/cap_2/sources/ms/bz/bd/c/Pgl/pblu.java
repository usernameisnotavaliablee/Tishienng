package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class pblu {
    public static final int q = -1;
    public static final int r = 0;
    public static final int s = 1;
    public static final int t = 290;
    public static final int u = 99999;
    public static final int v = 810;
    protected java.lang.String a;
    protected java.lang.String b;
    protected java.lang.String c;
    protected java.lang.String d;
    protected java.lang.String e;
    protected java.lang.String f;
    protected java.lang.String g;
    protected java.lang.String h;
    protected java.lang.String i;
    protected java.lang.String j;
    protected int k;
    protected int l;
    protected int m;
    protected java.util.Map<java.lang.String, java.lang.String> n;
    protected java.util.HashMap o;
    protected java.util.HashSet p;

    public interface pblb {
    }

    public static abstract class pgla<T extends ms.bz.bd.c.Pgl.pblu.pblb> extends ms.bz.bd.c.Pgl.pblu implements ms.bz.bd.c.Pgl.pblu.pblb {
        public pgla(java.lang.String r2, java.lang.String r3, int r4) {
                r1 = this;
                r1.<init>()
                r1.a = r2
                r1.i = r3
                r1.m = r4
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 != 0) goto L34
                java.lang.String r0 = "0"
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L34
                boolean r2 = android.text.TextUtils.isEmpty(r3)
                if (r2 != 0) goto L34
                r2 = 99999(0x1869f, float:1.40128E-40)
                if (r4 == r2) goto L33
                r2 = 290(0x122, float:4.06E-43)
                if (r4 == r2) goto L33
                r2 = 810(0x32a, float:1.135E-42)
                if (r4 != r2) goto L2b
                goto L33
            L2b:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "COLLECT_MODE is error "
                r2.<init>(r3)
                throw r2
            L33:
                return
            L34:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "appID or license must be set."
                r2.<init>(r3)
                throw r2
        }

        public pgla(java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.g = r1
                r0.h = r2
                r0.i = r3
                r0.m = r4
                boolean r4 = android.text.TextUtils.isEmpty(r1)
                if (r4 != 0) goto L26
                java.lang.String r4 = "0"
                boolean r1 = r4.equals(r1)
                if (r1 != 0) goto L26
                boolean r1 = android.text.TextUtils.isEmpty(r2)
                if (r1 != 0) goto L26
                boolean r1 = android.text.TextUtils.isEmpty(r3)
                if (r1 != 0) goto L26
                return
            L26:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "sdkID or license must be set."
                r1.<init>(r2)
                throw r1
        }

        protected final ms.bz.bd.c.Pgl.pblu.pgla b() {
                r1 = this;
                r0 = 1
                r1.k = r0
                return r1
        }

        public T c(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.util.HashMap r0 = r1.o
                r0.put(r2, r3)
                return r1
        }

        public T d(com.volcengine.mobsecBiz.metasec.listener.PglITokenObserver r2) {
                r1 = this;
                if (r2 == 0) goto L7
                java.util.HashSet r0 = r1.p
                r0.add(r2)
            L7:
                return r1
        }

        public T e(java.lang.String r1) {
                r0 = this;
                r0.d = r1
                return r0
        }

        public T f(java.lang.String r1) {
                r0 = this;
                r0.b = r1
                return r0
        }

        public T g(int r1) {
                r0 = this;
                r0.k = r1
                return r0
        }

        public T h(java.util.Map<java.lang.String, java.lang.String> r1) {
                r0 = this;
                if (r1 != 0) goto L7
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
            L7:
                r0.n = r1
                return r0
        }

        public T i(java.lang.String r1) {
                r0 = this;
                r0.c = r1
                return r0
        }

        public T j(java.lang.String r1) {
                r0 = this;
                r0.e = r1
                return r0
        }

        public T k(int r1) {
                r0 = this;
                r0.l = r1
                return r0
        }

        public T l(java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "timeout"
                boolean r0 = r4.equals(r0)
                java.lang.String r1 = "1"
                java.lang.String r2 = "kOA1"
                if (r0 != 0) goto L22
                java.lang.String r0 = "error"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L22
                boolean r0 = r4.isEmpty()
                if (r0 != 0) goto L21
                java.util.HashMap r0 = r3.o
                r0.put(r2, r1)
            L1f:
                r3.j = r4
            L21:
                return r3
            L22:
                java.util.HashMap r4 = r3.o
                r4.put(r2, r1)
                r4 = 0
                goto L1f
        }

        public T m(java.lang.String r1) {
                r0 = this;
                r0.f = r1
                return r0
        }
    }

    protected pblu() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.a = r0
            r1.b = r0
            r1.c = r0
            r1.d = r0
            r1.e = r0
            r1.f = r0
            r1.g = r0
            r1.h = r0
            r1.i = r0
            r0 = 0
            r1.j = r0
            r0 = -1
            r1.k = r0
            r1.l = r0
            r0 = 99999(0x1869f, float:1.40128E-40)
            r1.m = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.n = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.o = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.p = r0
            return
    }

    static java.lang.String a(java.lang.Object r1) {
            if (r1 == 0) goto Ld
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto Ld
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.trim()
            return r1
        Ld:
            java.lang.String r1 = ""
            return r1
    }
}
