package com.huawei.agconnect.core.a;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class c {
    private final android.content.Context a;

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class b implements java.io.Serializable, java.util.Comparator<java.util.Map.Entry<java.lang.String, java.lang.Integer>> {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ b(com.huawei.agconnect.core.a.c.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(java.util.Map.Entry<java.lang.String, java.lang.Integer> r1, java.util.Map.Entry<java.lang.String, java.lang.Integer> r2) {
                r0 = this;
                java.lang.Object r1 = r1.getValue()
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                java.lang.Object r2 = r2.getValue()
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                int r1 = r1 - r2
                return r1
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(java.util.Map.Entry<java.lang.String, java.lang.Integer> r1, java.util.Map.Entry<java.lang.String, java.lang.Integer> r2) {
                r0 = this;
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    c(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private <T extends com.huawei.agconnect.core.c> T a(java.lang.String r4) {
            r3 = this;
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r4)     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            java.lang.Class<com.huawei.agconnect.core.c> r2 = com.huawei.agconnect.core.c.class
            boolean r2 = r2.isAssignableFrom(r1)     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            if (r2 != 0) goto L17
            r1.toString()     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            return r0
        L11:
            r4 = move-exception
            goto L22
        L13:
            r4 = move-exception
            goto L22
        L15:
            r4 = move-exception
            goto L26
        L17:
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            java.lang.Object r4 = r4.newInstance()     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            com.huawei.agconnect.core.c r4 = (com.huawei.agconnect.core.c) r4     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            return r4
        L22:
            r4.getLocalizedMessage()
            goto L29
        L26:
            r4.getMessage()
        L29:
            return r0
    }

    private java.util.List<java.lang.String> c() {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Bundle r1 = r9.d()
            if (r1 != 0) goto Ld
            goto L8a
        Ld:
            java.util.HashMap r2 = new java.util.HashMap
            r3 = 10
            r2.<init>(r3)
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L1c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L60
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = r1.getString(r4)
            java.lang.String r6 = "com.huawei.agconnect.core.ServiceRegistrar"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L1c
            java.lang.String r5 = ":"
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 != r6) goto L51
            r5 = r4[r8]     // Catch: java.lang.NumberFormatException -> L4c
            r4 = r4[r7]     // Catch: java.lang.NumberFormatException -> L4c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L4c
            r2.put(r5, r4)     // Catch: java.lang.NumberFormatException -> L4c
            goto L1c
        L4c:
            r4 = move-exception
            r4.getMessage()
            goto L1c
        L51:
            int r5 = r4.length
            if (r5 != r7) goto L1c
            r4 = r4[r8]
            r5 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.put(r4, r5)
            goto L1c
        L60:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r2.entrySet()
            r1.<init>(r2)
            com.huawei.agconnect.core.a.c$b r2 = new com.huawei.agconnect.core.a.c$b
            r3 = 0
            r2.<init>(r3)
            java.util.Collections.sort(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L76:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            r0.add(r2)
            goto L76
        L8a:
            return r0
    }

    private android.os.Bundle d() {
            r5 = this;
            android.content.Context r0 = r5.a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
            android.content.Context r3 = r5.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
            java.lang.Class<com.huawei.agconnect.core.ServiceDiscovery> r4 = com.huawei.agconnect.core.ServiceDiscovery.class
            r2.<init>(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ServiceInfo r0 = r0.getServiceInfo(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
            if (r0 != 0) goto L1c
            goto L23
        L1c:
            android.os.Bundle r0 = r0.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
            return r0
        L1f:
            r0 = move-exception
            r0.getLocalizedMessage()
        L23:
            return r1
    }

    public java.util.List<com.huawei.agconnect.core.b> b() {
            r4 = this;
            java.util.List r0 = r4.c()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.huawei.agconnect.core.c r2 = r4.a(r2)
            if (r2 == 0) goto Ld
            android.content.Context r3 = r4.a
            r2.b(r3)
            android.content.Context r3 = r4.a
            java.util.List r2 = r2.a(r3)
            if (r2 == 0) goto Ld
            r1.addAll(r2)
            goto Ld
        L30:
            r1.size()
            return r1
    }
}
