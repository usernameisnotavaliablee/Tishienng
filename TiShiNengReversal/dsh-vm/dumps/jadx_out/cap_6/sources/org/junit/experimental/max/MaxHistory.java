package org.junit.experimental.max;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class MaxHistory implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final java.util.Map<java.lang.String, java.lang.Long> fDurations;
    private final java.util.Map<java.lang.String, java.lang.Long> fFailureTimestamps;
    private final java.io.File fHistoryStore;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class b extends org.junit.runner.notification.RunListener {
        private long a;
        private java.util.Map<org.junit.runner.Description, java.lang.Long> b;
        final /* synthetic */ org.junit.experimental.max.MaxHistory c;

        private b(org.junit.experimental.max.MaxHistory r3) {
                r2 = this;
                r2.c = r3
                r2.<init>()
                long r0 = java.lang.System.currentTimeMillis()
                r2.a = r0
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                r2.b = r3
                return
        }

        /* synthetic */ b(org.junit.experimental.max.MaxHistory r1, org.junit.experimental.max.MaxHistory.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // org.junit.runner.notification.RunListener
        public void b(org.junit.runner.notification.Failure r4) throws java.lang.Exception {
                r3 = this;
                org.junit.experimental.max.MaxHistory r0 = r3.c
                org.junit.runner.Description r4 = r4.getDescription()
                long r1 = r3.a
                r0.putTestFailureTimestamp(r4, r1)
                return
        }

        @Override // org.junit.runner.notification.RunListener
        public void c(org.junit.runner.Description r6) throws java.lang.Exception {
                r5 = this;
                long r0 = java.lang.System.nanoTime()
                java.util.Map<org.junit.runner.Description, java.lang.Long> r2 = r5.b
                java.lang.Object r2 = r2.get(r6)
                java.lang.Long r2 = (java.lang.Long) r2
                long r2 = r2.longValue()
                org.junit.experimental.max.MaxHistory r4 = r5.c
                long r0 = r0 - r2
                r4.putTestDuration(r6, r0)
                return
        }

        @Override // org.junit.runner.notification.RunListener
        public void e(org.junit.runner.Result r1) throws java.lang.Exception {
                r0 = this;
                org.junit.experimental.max.MaxHistory r1 = r0.c
                org.junit.experimental.max.MaxHistory.access$000(r1)
                return
        }

        @Override // org.junit.runner.notification.RunListener
        public void g(org.junit.runner.Description r4) throws java.lang.Exception {
                r3 = this;
                java.util.Map<org.junit.runner.Description, java.lang.Long> r0 = r3.b
                long r1 = java.lang.System.nanoTime()
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.put(r4, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements java.util.Comparator<org.junit.runner.Description> {
        final /* synthetic */ org.junit.experimental.max.MaxHistory a;

        private c(org.junit.experimental.max.MaxHistory r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ c(org.junit.experimental.max.MaxHistory r1, org.junit.experimental.max.MaxHistory.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private java.lang.Long b(org.junit.runner.Description r3) {
                r2 = this;
                org.junit.experimental.max.MaxHistory r0 = r2.a
                java.lang.Long r3 = r0.getFailureTimestamp(r3)
                if (r3 != 0) goto Le
                r0 = 0
                java.lang.Long r3 = java.lang.Long.valueOf(r0)
            Le:
                return r3
        }

        public int a(org.junit.runner.Description r3, org.junit.runner.Description r4) {
                r2 = this;
                org.junit.experimental.max.MaxHistory r0 = r2.a
                boolean r0 = r0.isNewTest(r3)
                if (r0 == 0) goto La
                r3 = -1
                return r3
            La:
                org.junit.experimental.max.MaxHistory r0 = r2.a
                boolean r0 = r0.isNewTest(r4)
                if (r0 == 0) goto L14
                r3 = 1
                return r3
            L14:
                java.lang.Long r0 = r2.b(r4)
                java.lang.Long r1 = r2.b(r3)
                int r0 = r0.compareTo(r1)
                if (r0 == 0) goto L23
                return r0
            L23:
                org.junit.experimental.max.MaxHistory r0 = r2.a
                java.lang.Long r3 = r0.getTestDuration(r3)
                org.junit.experimental.max.MaxHistory r0 = r2.a
                java.lang.Long r4 = r0.getTestDuration(r4)
                int r3 = r3.compareTo(r4)
                return r3
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(org.junit.runner.Description r1, org.junit.runner.Description r2) {
                r0 = this;
                org.junit.runner.Description r1 = (org.junit.runner.Description) r1
                org.junit.runner.Description r2 = (org.junit.runner.Description) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    private MaxHistory(java.io.File r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.fDurations = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.fFailureTimestamps = r0
            r1.fHistoryStore = r2
            return
    }

    static /* synthetic */ void access$000(org.junit.experimental.max.MaxHistory r0) throws java.io.IOException {
            r0.save()
            return
    }

    public static org.junit.experimental.max.MaxHistory forFolder(java.io.File r1) {
            boolean r0 = r1.exists()
            if (r0 == 0) goto Le
            org.junit.experimental.max.MaxHistory r1 = readHistory(r1)     // Catch: org.junit.experimental.max.CouldNotReadCoreException -> Lb
            return r1
        Lb:
            r1.delete()
        Le:
            org.junit.experimental.max.MaxHistory r0 = new org.junit.experimental.max.MaxHistory
            r0.<init>(r1)
            return r0
    }

    private static org.junit.experimental.max.MaxHistory readHistory(java.io.File r2) throws org.junit.experimental.max.CouldNotReadCoreException {
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L22
            r0.<init>(r2)     // Catch: java.lang.Exception -> L22
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L17
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r2.readObject()     // Catch: java.lang.Throwable -> L19
            org.junit.experimental.max.MaxHistory r1 = (org.junit.experimental.max.MaxHistory) r1     // Catch: java.lang.Throwable -> L19
            r2.close()     // Catch: java.lang.Throwable -> L17
            r0.close()     // Catch: java.lang.Exception -> L22
            return r1
        L17:
            r2 = move-exception
            goto L1e
        L19:
            r1 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L17
            throw r1     // Catch: java.lang.Throwable -> L17
        L1e:
            r0.close()     // Catch: java.lang.Exception -> L22
            throw r2     // Catch: java.lang.Exception -> L22
        L22:
            r2 = move-exception
            org.junit.experimental.max.CouldNotReadCoreException r0 = new org.junit.experimental.max.CouldNotReadCoreException
            r0.<init>(r2)
            throw r0
    }

    private void save() throws java.io.IOException {
            r3 = this;
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            java.io.File r2 = r3.fHistoryStore
            r1.<init>(r2)
            r0.<init>(r1)
            r0.writeObject(r3)
            r0.close()
            return
    }

    java.lang.Long getFailureTimestamp(org.junit.runner.Description r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Long> r0 = r1.fFailureTimestamps
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r0.get(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            return r2
    }

    java.lang.Long getTestDuration(org.junit.runner.Description r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Long> r0 = r1.fDurations
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r0.get(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            return r2
    }

    boolean isNewTest(org.junit.runner.Description r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Long> r0 = r1.fDurations
            java.lang.String r2 = r2.toString()
            boolean r2 = r0.containsKey(r2)
            r2 = r2 ^ 1
            return r2
    }

    public org.junit.runner.notification.RunListener listener() {
            r2 = this;
            org.junit.experimental.max.MaxHistory$b r0 = new org.junit.experimental.max.MaxHistory$b
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    void putTestDuration(org.junit.runner.Description r2, long r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Long> r0 = r1.fDurations
            java.lang.String r2 = r2.toString()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.put(r2, r3)
            return
    }

    void putTestFailureTimestamp(org.junit.runner.Description r2, long r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Long> r0 = r1.fFailureTimestamps
            java.lang.String r2 = r2.toString()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.put(r2, r3)
            return
    }

    public java.util.Comparator<org.junit.runner.Description> testComparator() {
            r2 = this;
            org.junit.experimental.max.MaxHistory$c r0 = new org.junit.experimental.max.MaxHistory$c
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
