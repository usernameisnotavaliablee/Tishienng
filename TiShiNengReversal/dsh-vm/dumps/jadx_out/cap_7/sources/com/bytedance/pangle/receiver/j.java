package com.bytedance.pangle.receiver;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class j {
    private static final com.bytedance.pangle.receiver.j.cw j = null;

    /* renamed from: com.bytedance.pangle.receiver.j$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private interface cw {
        boolean j(android.content.Context r1) throws java.lang.Throwable;
    }

    /* renamed from: com.bytedance.pangle.receiver.j$j, reason: collision with other inner class name */
    private static class C0010j implements com.bytedance.pangle.receiver.j.cw {
        private C0010j() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ C0010j(com.bytedance.pangle.receiver.j.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private java.lang.Object j(java.lang.Object r1, java.lang.String r2) {
                r0 = this;
                if (r1 == 0) goto L7
                java.lang.Object r1 = com.bytedance.pangle.util.FieldUtils.readField(r1, r2)     // Catch: java.lang.Throwable -> L7
                return r1
            L7:
                r1 = 0
                return r1
        }

        private java.lang.Object xt(android.content.Context r4) {
                r3 = this;
                java.lang.String r0 = "android.app.LoadedApk"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L27
                java.lang.String r1 = "mReceiverResource"
                java.lang.reflect.Field r0 = com.bytedance.pangle.util.FieldUtils.getField(r0, r1)     // Catch: java.lang.Throwable -> L27
                if (r0 == 0) goto L27
                java.lang.String r1 = "android.app.ContextImpl"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L27
                java.lang.String r2 = "mPackageInfo"
                java.lang.reflect.Field r1 = com.bytedance.pangle.util.FieldUtils.getField(r1, r2)     // Catch: java.lang.Throwable -> L27
                if (r1 == 0) goto L27
                java.lang.Object r4 = com.bytedance.pangle.util.FieldUtils.readField(r1, r4)     // Catch: java.lang.Throwable -> L27
                if (r4 == 0) goto L27
                java.lang.Object r4 = com.bytedance.pangle.util.FieldUtils.readField(r0, r4)     // Catch: java.lang.Throwable -> L27
                return r4
            L27:
                r4 = 0
                return r4
        }

        java.lang.Object j(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.Object r1 = r0.xt(r1)
                java.lang.Object r1 = r0.j(r1, r2)
                return r1
        }

        @Override // com.bytedance.pangle.receiver.j.cw
        public boolean j(android.content.Context r5) throws java.lang.Throwable {
                r4 = this;
                java.lang.Object r0 = r4.xt(r5)
                java.lang.String r1 = "mWhiteList"
                java.lang.Object r2 = r4.j(r0, r1)
                boolean r3 = r2 instanceof java.lang.String[]
                if (r3 == 0) goto L2e
                java.lang.String[] r2 = (java.lang.String[]) r2
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.lang.String r5 = r5.getPackageName()
                r3.add(r5)
                java.util.Collections.addAll(r3, r2)
                int r5 = r3.size()
                java.lang.String[] r5 = new java.lang.String[r5]
                java.lang.Object[] r5 = r3.toArray(r5)
                com.bytedance.pangle.util.FieldUtils.writeField(r0, r1, r5)
                r5 = 1
                return r5
            L2e:
                if (r0 == 0) goto L36
                java.lang.String r5 = "mResourceConfig"
                r1 = 0
                com.bytedance.pangle.util.FieldUtils.writeField(r0, r5, r1)
            L36:
                r5 = 0
                return r5
        }
    }

    private static class r extends com.bytedance.pangle.receiver.j.C0010j {
        private r() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ r(com.bytedance.pangle.receiver.j.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bytedance.pangle.receiver.j.C0010j, com.bytedance.pangle.receiver.j.cw
        public boolean j(android.content.Context r3) throws java.lang.Throwable {
                r2 = this;
                java.lang.String r0 = "mWhiteList"
                java.lang.Object r0 = r2.j(r3, r0)
                boolean r1 = r0 instanceof java.util.List
                if (r1 == 0) goto L15
                java.util.List r0 = (java.util.List) r0
                java.lang.String r3 = r3.getPackageName()
                r0.add(r3)
                r3 = 1
                return r3
            L15:
                r3 = 0
                return r3
        }
    }

    private static class up extends com.bytedance.pangle.receiver.j.C0010j {
        private up() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ up(com.bytedance.pangle.receiver.j.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bytedance.pangle.receiver.j.C0010j, com.bytedance.pangle.receiver.j.cw
        public boolean j(android.content.Context r5) throws java.lang.Throwable {
                r4 = this;
                r0 = 0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                java.lang.String r2 = "mWhiteListMap"
                java.lang.Object r2 = r4.j(r5, r2)
                boolean r3 = r2 instanceof java.util.Map
                if (r3 == 0) goto L2a
                java.util.Map r2 = (java.util.Map) r2
                java.lang.Object r0 = r2.get(r1)
                java.util.List r0 = (java.util.List) r0
                if (r0 != 0) goto L21
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.put(r1, r0)
            L21:
                java.lang.String r5 = r5.getPackageName()
                r0.add(r5)
                r5 = 1
                return r5
            L2a:
                return r0
        }
    }

    private static class xt extends com.bytedance.pangle.receiver.j.up {
        private xt() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ xt(com.bytedance.pangle.receiver.j.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bytedance.pangle.receiver.j.up, com.bytedance.pangle.receiver.j.C0010j, com.bytedance.pangle.receiver.j.cw
        public boolean j(android.content.Context r1) throws java.lang.Throwable {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            r2 = 0
            if (r0 >= r1) goto Lf
            com.bytedance.pangle.receiver.j$j r0 = new com.bytedance.pangle.receiver.j$j
            r0.<init>(r2)
            com.bytedance.pangle.receiver.j.j = r0
            return
        Lf:
            r1 = 26
            if (r0 >= r1) goto L1b
            com.bytedance.pangle.receiver.j$r r0 = new com.bytedance.pangle.receiver.j$r
            r0.<init>(r2)
            com.bytedance.pangle.receiver.j.j = r0
            return
        L1b:
            r1 = 28
            if (r0 >= r1) goto L27
            com.bytedance.pangle.receiver.j$up r0 = new com.bytedance.pangle.receiver.j$up
            r0.<init>(r2)
            com.bytedance.pangle.receiver.j.j = r0
            return
        L27:
            com.bytedance.pangle.receiver.j$xt r0 = new com.bytedance.pangle.receiver.j$xt
            r0.<init>(r2)
            com.bytedance.pangle.receiver.j.j = r0
            return
    }

    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void j(android.app.Application r1) {
            if (r1 == 0) goto L11
            boolean r0 = com.bytedance.pangle.util.g.kt()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L11
            com.bytedance.pangle.receiver.j$cw r0 = com.bytedance.pangle.receiver.j.j     // Catch: java.lang.Throwable -> L11
            android.content.Context r1 = r1.getBaseContext()     // Catch: java.lang.Throwable -> L11
            r0.j(r1)     // Catch: java.lang.Throwable -> L11
        L11:
            return
    }
}
