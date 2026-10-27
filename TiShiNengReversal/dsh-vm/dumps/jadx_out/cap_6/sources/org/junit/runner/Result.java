package org.junit.runner;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Result implements java.io.Serializable {
    private static final java.io.ObjectStreamField[] serialPersistentFields = null;
    private static final long serialVersionUID = 1;
    private final java.util.concurrent.atomic.AtomicInteger count;
    private final java.util.concurrent.CopyOnWriteArrayList<org.junit.runner.notification.Failure> failures;
    private final java.util.concurrent.atomic.AtomicInteger ignoreCount;
    private final java.util.concurrent.atomic.AtomicLong runTime;
    private org.junit.runner.Result.c serializedForm;
    private final java.util.concurrent.atomic.AtomicLong startTime;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @org.junit.runner.notification.RunListener.ThreadSafe
    private class b extends org.junit.runner.notification.RunListener {
        final /* synthetic */ org.junit.runner.Result a;

        private b(org.junit.runner.Result r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(org.junit.runner.Result r1, org.junit.runner.Result.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // org.junit.runner.notification.RunListener
        public void a(org.junit.runner.notification.Failure r1) {
                r0 = this;
                return
        }

        @Override // org.junit.runner.notification.RunListener
        public void b(org.junit.runner.notification.Failure r2) throws java.lang.Exception {
                r1 = this;
                org.junit.runner.Result r0 = r1.a
                java.util.concurrent.CopyOnWriteArrayList r0 = org.junit.runner.Result.access$800(r0)
                r0.add(r2)
                return
        }

        @Override // org.junit.runner.notification.RunListener
        public void c(org.junit.runner.Description r1) throws java.lang.Exception {
                r0 = this;
                org.junit.runner.Result r1 = r0.a
                java.util.concurrent.atomic.AtomicInteger r1 = org.junit.runner.Result.access$700(r1)
                r1.getAndIncrement()
                return
        }

        @Override // org.junit.runner.notification.RunListener
        public void d(org.junit.runner.Description r1) throws java.lang.Exception {
                r0 = this;
                org.junit.runner.Result r1 = r0.a
                java.util.concurrent.atomic.AtomicInteger r1 = org.junit.runner.Result.access$900(r1)
                r1.getAndIncrement()
                return
        }

        @Override // org.junit.runner.notification.RunListener
        public void e(org.junit.runner.Result r5) throws java.lang.Exception {
                r4 = this;
                long r0 = java.lang.System.currentTimeMillis()
                org.junit.runner.Result r5 = r4.a
                java.util.concurrent.atomic.AtomicLong r5 = org.junit.runner.Result.access$600(r5)
                org.junit.runner.Result r2 = r4.a
                java.util.concurrent.atomic.AtomicLong r2 = org.junit.runner.Result.access$500(r2)
                long r2 = r2.get()
                long r0 = r0 - r2
                r5.addAndGet(r0)
                return
        }

        @Override // org.junit.runner.notification.RunListener
        public void f(org.junit.runner.Description r3) throws java.lang.Exception {
                r2 = this;
                org.junit.runner.Result r3 = r2.a
                java.util.concurrent.atomic.AtomicLong r3 = org.junit.runner.Result.access$500(r3)
                long r0 = java.lang.System.currentTimeMillis()
                r3.set(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c implements java.io.Serializable {
        private static final long serialVersionUID = 1;
        private final java.util.concurrent.atomic.AtomicInteger a;
        private final java.util.concurrent.atomic.AtomicInteger b;
        private final java.util.List<org.junit.runner.notification.Failure> c;
        private final long d;
        private final long e;

        private c(java.io.ObjectInputStream.GetField r6) throws java.io.IOException {
                r5 = this;
                r5.<init>()
                java.lang.String r0 = "fCount"
                r1 = 0
                java.lang.Object r0 = r6.get(r0, r1)
                java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
                r5.a = r0
                java.lang.String r0 = "fIgnoreCount"
                java.lang.Object r0 = r6.get(r0, r1)
                java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
                r5.b = r0
                java.lang.String r0 = "fFailures"
                java.lang.Object r0 = r6.get(r0, r1)
                java.util.List r0 = (java.util.List) r0
                r5.c = r0
                java.lang.String r0 = "fRunTime"
                r1 = 0
                long r3 = r6.get(r0, r1)
                r5.d = r3
                java.lang.String r0 = "fStartTime"
                long r0 = r6.get(r0, r1)
                r5.e = r0
                return
        }

        public c(org.junit.runner.Result r3) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = org.junit.runner.Result.access$700(r3)
                r2.a = r0
                java.util.concurrent.atomic.AtomicInteger r0 = org.junit.runner.Result.access$900(r3)
                r2.b = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.concurrent.CopyOnWriteArrayList r1 = org.junit.runner.Result.access$800(r3)
                r0.<init>(r1)
                java.util.List r0 = java.util.Collections.synchronizedList(r0)
                r2.c = r0
                java.util.concurrent.atomic.AtomicLong r0 = org.junit.runner.Result.access$600(r3)
                long r0 = r0.longValue()
                r2.d = r0
                java.util.concurrent.atomic.AtomicLong r3 = org.junit.runner.Result.access$500(r3)
                long r0 = r3.longValue()
                r2.e = r0
                return
        }

        static /* synthetic */ java.util.concurrent.atomic.AtomicInteger a(org.junit.runner.Result.c r0) {
                java.util.concurrent.atomic.AtomicInteger r0 = r0.a
                return r0
        }

        static /* synthetic */ java.util.concurrent.atomic.AtomicInteger b(org.junit.runner.Result.c r0) {
                java.util.concurrent.atomic.AtomicInteger r0 = r0.b
                return r0
        }

        static /* synthetic */ java.util.List c(org.junit.runner.Result.c r0) {
                java.util.List<org.junit.runner.notification.Failure> r0 = r0.c
                return r0
        }

        static /* synthetic */ long d(org.junit.runner.Result.c r2) {
                long r0 = r2.d
                return r0
        }

        static /* synthetic */ long e(org.junit.runner.Result.c r2) {
                long r0 = r2.e
                return r0
        }

        public static org.junit.runner.Result.c f(java.io.ObjectInputStream r1) throws java.lang.ClassNotFoundException, java.io.IOException {
                java.io.ObjectInputStream$GetField r1 = r1.readFields()
                org.junit.runner.Result$c r0 = new org.junit.runner.Result$c
                r0.<init>(r1)
                return r0
        }

        public void g(java.io.ObjectOutputStream r5) throws java.io.IOException {
                r4 = this;
                java.io.ObjectOutputStream$PutField r0 = r5.putFields()
                java.lang.String r1 = "fCount"
                java.util.concurrent.atomic.AtomicInteger r2 = r4.a
                r0.put(r1, r2)
                java.lang.String r1 = "fIgnoreCount"
                java.util.concurrent.atomic.AtomicInteger r2 = r4.b
                r0.put(r1, r2)
                java.lang.String r1 = "fFailures"
                java.util.List<org.junit.runner.notification.Failure> r2 = r4.c
                r0.put(r1, r2)
                java.lang.String r1 = "fRunTime"
                long r2 = r4.d
                r0.put(r1, r2)
                java.lang.String r1 = "fStartTime"
                long r2 = r4.e
                r0.put(r1, r2)
                r5.writeFields()
                return
        }
    }

    static {
            java.lang.Class<org.junit.runner.Result$c> r0 = org.junit.runner.Result.c.class
            java.io.ObjectStreamClass r0 = java.io.ObjectStreamClass.lookup(r0)
            java.io.ObjectStreamField[] r0 = r0.getFields()
            org.junit.runner.Result.serialPersistentFields = r0
            return
    }

    public Result() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.count = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.ignoreCount = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.failures = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r1.runTime = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r1.startTime = r0
            return
    }

    private Result(org.junit.runner.Result.c r4) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = org.junit.runner.Result.c.a(r4)
            r3.count = r0
            java.util.concurrent.atomic.AtomicInteger r0 = org.junit.runner.Result.c.b(r4)
            r3.ignoreCount = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.List r1 = org.junit.runner.Result.c.c(r4)
            r0.<init>(r1)
            r3.failures = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            long r1 = org.junit.runner.Result.c.d(r4)
            r0.<init>(r1)
            r3.runTime = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            long r1 = org.junit.runner.Result.c.e(r4)
            r0.<init>(r1)
            r3.startTime = r0
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicLong access$500(org.junit.runner.Result r0) {
            java.util.concurrent.atomic.AtomicLong r0 = r0.startTime
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicLong access$600(org.junit.runner.Result r0) {
            java.util.concurrent.atomic.AtomicLong r0 = r0.runTime
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicInteger access$700(org.junit.runner.Result r0) {
            java.util.concurrent.atomic.AtomicInteger r0 = r0.count
            return r0
    }

    static /* synthetic */ java.util.concurrent.CopyOnWriteArrayList access$800(org.junit.runner.Result r0) {
            java.util.concurrent.CopyOnWriteArrayList<org.junit.runner.notification.Failure> r0 = r0.failures
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicInteger access$900(org.junit.runner.Result r0) {
            java.util.concurrent.atomic.AtomicInteger r0 = r0.ignoreCount
            return r0
    }

    private void readObject(java.io.ObjectInputStream r1) throws java.lang.ClassNotFoundException, java.io.IOException {
            r0 = this;
            org.junit.runner.Result$c r1 = org.junit.runner.Result.c.f(r1)
            r0.serializedForm = r1
            return
    }

    private java.lang.Object readResolve() {
            r2 = this;
            org.junit.runner.Result r0 = new org.junit.runner.Result
            org.junit.runner.Result$c r1 = r2.serializedForm
            r0.<init>(r1)
            return r0
    }

    private void writeObject(java.io.ObjectOutputStream r2) throws java.io.IOException {
            r1 = this;
            org.junit.runner.Result$c r0 = new org.junit.runner.Result$c
            r0.<init>(r1)
            r0.g(r2)
            return
    }

    public org.junit.runner.notification.RunListener createListener() {
            r2 = this;
            org.junit.runner.Result$b r0 = new org.junit.runner.Result$b
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public int getFailureCount() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<org.junit.runner.notification.Failure> r0 = r1.failures
            int r0 = r0.size()
            return r0
    }

    public java.util.List<org.junit.runner.notification.Failure> getFailures() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<org.junit.runner.notification.Failure> r0 = r1.failures
            return r0
    }

    public int getIgnoreCount() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.ignoreCount
            int r0 = r0.get()
            return r0
    }

    public int getRunCount() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.count
            int r0 = r0.get()
            return r0
    }

    public long getRunTime() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.runTime
            long r0 = r0.get()
            return r0
    }

    public boolean wasSuccessful() {
            r1 = this;
            int r0 = r1.getFailureCount()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
