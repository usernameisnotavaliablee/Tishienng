package junit.framework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class JUnit4TestAdapterCache extends java.util.HashMap<org.junit.runner.Description, junit.framework.f> {
    private static final junit.framework.JUnit4TestAdapterCache fInstance = null;
    private static final long serialVersionUID = 1;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends org.junit.runner.notification.RunListener {
        final /* synthetic */ junit.framework.j a;
        final /* synthetic */ junit.framework.JUnit4TestAdapterCache b;

        a(junit.framework.JUnit4TestAdapterCache r1, junit.framework.j r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void b(org.junit.runner.notification.Failure r4) throws java.lang.Exception {
                r3 = this;
                junit.framework.j r0 = r3.a
                junit.framework.JUnit4TestAdapterCache r1 = r3.b
                org.junit.runner.Description r2 = r4.getDescription()
                junit.framework.f r1 = r1.asTest(r2)
                java.lang.Throwable r4 = r4.getException()
                r0.a(r1, r4)
                return
        }

        public void c(org.junit.runner.Description r3) throws java.lang.Exception {
                r2 = this;
                junit.framework.j r0 = r2.a
                junit.framework.JUnit4TestAdapterCache r1 = r2.b
                junit.framework.f r3 = r1.asTest(r3)
                r0.e(r3)
                return
        }

        public void g(org.junit.runner.Description r3) throws java.lang.Exception {
                r2 = this;
                junit.framework.j r0 = r2.a
                junit.framework.JUnit4TestAdapterCache r1 = r2.b
                junit.framework.f r3 = r1.asTest(r3)
                r0.o(r3)
                return
        }
    }

    static {
            junit.framework.JUnit4TestAdapterCache r0 = new junit.framework.JUnit4TestAdapterCache
            r0.<init>()
            junit.framework.JUnit4TestAdapterCache.fInstance = r0
            return
    }

    public JUnit4TestAdapterCache() {
            r0 = this;
            r0.<init>()
            return
    }

    public static junit.framework.JUnit4TestAdapterCache getDefault() {
            junit.framework.JUnit4TestAdapterCache r0 = junit.framework.JUnit4TestAdapterCache.fInstance
            return r0
    }

    public junit.framework.f asTest(org.junit.runner.Description r2) {
            r1 = this;
            boolean r0 = r2.isSuite()
            if (r0 == 0) goto Lb
            junit.framework.f r2 = r1.createTest(r2)
            return r2
        Lb:
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L18
            junit.framework.f r0 = r1.createTest(r2)
            r1.put(r2, r0)
        L18:
            java.lang.Object r2 = r1.get(r2)
            junit.framework.f r2 = (junit.framework.f) r2
            return r2
    }

    public java.util.List<junit.framework.f> asTestList(org.junit.runner.Description r3) {
            r2 = this;
            boolean r0 = r3.isTest()
            if (r0 == 0) goto L15
            junit.framework.f r3 = r2.asTest(r3)
            r0 = 1
            junit.framework.f[] r0 = new junit.framework.f[r0]
            r1 = 0
            r0[r1] = r3
            java.util.List r3 = java.util.Arrays.asList(r0)
            return r3
        L15:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = r3.getChildren()
            java.util.Iterator r3 = r3.iterator()
        L22:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r3.next()
            org.junit.runner.Description r1 = (org.junit.runner.Description) r1
            junit.framework.f r1 = r2.asTest(r1)
            r0.add(r1)
            goto L22
        L36:
            return r0
    }

    junit.framework.f createTest(org.junit.runner.Description r3) {
            r2 = this;
            boolean r0 = r3.isTest()
            if (r0 == 0) goto Lc
            junit.framework.d r0 = new junit.framework.d
            r0.<init>(r3)
            return r0
        Lc:
            junit.framework.k r0 = new junit.framework.k
            java.lang.String r1 = r3.getDisplayName()
            r0.<init>(r1)
            java.util.ArrayList r3 = r3.getChildren()
            java.util.Iterator r3 = r3.iterator()
        L1d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r3.next()
            org.junit.runner.Description r1 = (org.junit.runner.Description) r1
            junit.framework.f r1 = r2.asTest(r1)
            r0.b(r1)
            goto L1d
        L31:
            return r0
    }

    public org.junit.runner.notification.a getNotifier(junit.framework.j r2, junit.framework.c r3) {
            r1 = this;
            org.junit.runner.notification.a r3 = new org.junit.runner.notification.a
            r3.<init>()
            junit.framework.JUnit4TestAdapterCache$a r0 = new junit.framework.JUnit4TestAdapterCache$a
            r0.<init>(r1, r2)
            r3.d(r0)
            return r3
    }
}
