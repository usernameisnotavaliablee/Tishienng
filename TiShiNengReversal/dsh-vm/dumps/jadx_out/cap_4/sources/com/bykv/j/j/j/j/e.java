package com.bykv.j.j.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class e {
    public static final com.bykv.vk.openvk.api.proto.PluginValueSet c = null;
    public static final java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> d = null;
    private final android.util.SparseArray<java.lang.Object> a;
    private com.bykv.vk.openvk.api.proto.PluginValueSet b;

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class b<T, R> implements java.util.function.Function<T, R> {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ b(com.bykv.j.j.j.j.e.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.function.Function
        public R apply(T r3) {
                r2 = this;
                boolean r0 = r3 instanceof android.util.SparseArray
                r1 = 0
                if (r0 == 0) goto L56
                android.util.SparseArray r3 = (android.util.SparseArray) r3
                r0 = -99999985(0xfffffffffa0a1f0f, float:-1.7929173E35)
                java.lang.Object r3 = r3.get(r0)
                java.lang.Class r3 = (java.lang.Class) r3
                java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
                if (r3 == r0) goto L53
                java.lang.Class r0 = java.lang.Boolean.TYPE
                if (r3 == r0) goto L53
                java.lang.Class r0 = java.lang.Integer.TYPE
                if (r3 == r0) goto L4d
                java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
                if (r3 == r0) goto L4d
                java.lang.Class r0 = java.lang.Long.TYPE
                if (r3 == r0) goto L46
                java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
                if (r3 == r0) goto L46
                java.lang.Class r0 = java.lang.Double.TYPE
                if (r3 == r0) goto L3f
                java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
                if (r3 == r0) goto L3f
                java.lang.Class r0 = java.lang.Float.TYPE
                if (r3 == r0) goto L39
                java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
                if (r3 == r0) goto L39
                return r1
            L39:
                r3 = 0
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                return r3
            L3f:
                r0 = 0
                java.lang.Double r3 = java.lang.Double.valueOf(r0)
                return r3
            L46:
                r0 = 0
                java.lang.Long r3 = java.lang.Long.valueOf(r0)
                return r3
            L4d:
                r3 = 0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                return r3
            L53:
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                return r3
            L56:
                return r1
        }
    }

    private static final class c implements com.bykv.vk.openvk.api.proto.PluginValueSet {
        private final android.util.SparseArray<java.lang.Object> a;
        private com.bykv.vk.openvk.api.proto.PluginValueSet b;
        private int c;

        private c(android.util.SparseArray<java.lang.Object> r2, com.bykv.vk.openvk.api.proto.PluginValueSet r3) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.c = r0
                r1.a = r2
                r1.b = r3
                return
        }

        /* synthetic */ c(android.util.SparseArray r1, com.bykv.vk.openvk.api.proto.PluginValueSet r2, com.bykv.j.j.j.j.e.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private boolean a() {
                r2 = this;
                q0.a r0 = q0.a.a()
                int r0 = r0.c()
                r1 = 6803(0x1a93, float:9.533E-42)
                if (r0 < r1) goto L1a
                q0.a r0 = q0.a.a()
                int r0 = r0.c()
                r1 = 7000(0x1b58, float:9.809E-42)
                if (r0 >= r1) goto L1a
                r0 = 1
                return r0
            L1a:
                r0 = 0
                return r0
        }

        private boolean b(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r3.a()
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L1a
                boolean r0 = com.bykv.j.j.j.j.b.a(r4)
                if (r0 == 0) goto L19
                boolean r0 = com.bykv.j.j.j.j.f.a(r4)
                if (r0 != 0) goto L19
                boolean r4 = r4 instanceof com.bykv.vk.openvk.api.proto.ValueSet
                if (r4 != 0) goto L19
                return r2
            L19:
                return r1
            L1a:
                boolean r0 = com.bykv.j.j.j.j.b.a(r4)
                if (r0 == 0) goto L27
                boolean r4 = com.bykv.j.j.j.j.f.a(r4)
                if (r4 != 0) goto L27
                return r2
            L27:
                return r1
        }

        private boolean c() {
                r1 = this;
                android.util.SparseArray<java.lang.Object> r0 = r1.a
                boolean r0 = r0 instanceof com.bytedance.sdk.openadsdk.i.xt.j
                if (r0 != 0) goto L15
                com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r1.b
                if (r0 == 0) goto L13
                android.util.SparseArray r0 = r0.sparseArray()
                boolean r0 = r0 instanceof com.bytedance.sdk.openadsdk.i.xt.j
                if (r0 == 0) goto L13
                goto L15
            L13:
                r0 = 0
                return r0
            L15:
                r0 = 1
                return r0
        }

        @Override // com.bykv.vk.openvk.api.proto.PluginValueSet
        public <T> T[] arrayValue(int r4, java.lang.Class<T> r5) {
                r3 = this;
                android.util.SparseArray<java.lang.Object> r0 = r3.a
                java.lang.Object r0 = r0.get(r4)
                r1 = 0
                if (r0 != 0) goto L13
                com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r3.b
                if (r0 == 0) goto L12
                java.lang.Object[] r4 = r0.arrayValue(r4, r5)
                return r4
            L12:
                return r1
            L13:
                java.lang.Class r4 = r0.getClass()
                boolean r2 = r4.isArray()
                if (r2 == 0) goto L2a
                java.lang.Class r4 = r4.getComponentType()
                boolean r4 = r5.isAssignableFrom(r4)
                if (r4 == 0) goto L2a
                java.lang.Object[] r0 = (java.lang.Object[]) r0
                return r0
            L2a:
                return r1
        }

        @Override // com.bykv.vk.openvk.api.proto.PluginValueSet
        public boolean booleanValue(int r2) {
                r1 = this;
                r0 = 0
                boolean r2 = r1.booleanValue(r2, r0)
                return r2
        }

        @Override // com.bykv.vk.openvk.api.proto.PluginValueSet
        public boolean booleanValue(int r3, boolean r4) {
                r2 = this;
                android.util.SparseArray<java.lang.Object> r0 = r2.a
                java.lang.Object r0 = r0.get(r3)
                if (r0 != 0) goto L11
                com.bykv.vk.openvk.api.proto.PluginValueSet r1 = r2.b
                if (r1 == 0) goto L11
                boolean r3 = r1.booleanValue(r3, r4)
                return r3
            L11:
                boolean r3 = com.bykv.j.j.j.j.b.a(r0)
                if (r3 == 0) goto L1f
                java.util.function.Supplier r3 = com.bykv.j.j.j.j.c.a(r0)
                java.lang.Object r0 = com.bykv.j.j.j.j.d.a(r3)
            L1f:
                boolean r3 = r0 instanceof java.lang.Boolean
                if (r3 == 0) goto L2a
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r3 = r0.booleanValue()
                return r3
            L2a:
                return r4
        }

        @Override // com.bykv.vk.openvk.api.proto.PluginValueSet
        public boolean containsKey(int r3) {
                r2 = this;
                android.util.SparseArray<java.lang.Object> r0 = r2.a
                int r0 = r0.indexOfKey(r3)
                if (r0 >= 0) goto L11
                com.bykv.vk.openvk.api.proto.PluginValueSet r1 = r2.b
                if (r1 == 0) goto L11
                boolean r3 = r1.containsKey(r3)
                return r3
            L11:
                if (r0 < 0) goto L15
                r3 = 1
                return r3
            L15:
                r3 = 0
                return r3
        }

        @Override // com.bykv.vk.openvk.api.proto.PluginValueSet
        public double doubleValue(int r3) {
                r2 = this;
                android.util.SparseArray<java.lang.Object> r0 = r2.a
                java.lang.Object r0 = r0.get(r3)
                if (r0 != 0) goto L11
                com.bykv.vk.openvk.api.proto.PluginValueSet r1 = r2.b
                if (r1 == 0) goto L11
                double r0 = r1.doubleValue(r3)
                return r0
            L11:
                boolean r3 = com.bykv.j.j.j.j.b.a(r0)
                if (r3 == 0) goto L1f
                java.util.function.Supplier r3 = com.bykv.j.j.j.j.c.a(r0)
                java.lang.Object r0 = com.bykv.j.j.j.j.d.a(r3)
            L1f:
                boolean r3 = r0 instanceof java.lang.Double
                if (r3 == 0) goto L2a
                java.lang.Double r0 = (java.lang.Double) r0
                double r0 = r0.doubleValue()
                return r0
            L2a:
                r0 = 0
                return r0
        }

        @Override // com.bykv.vk.openvk.api.proto.PluginValueSet
        public float floatValue(int r2) {
                r1 = this;
                r0 = 0
                float r2 = r1.floatValue(r2, r0)
                return r2
        }

        @Override // com.bykv.vk.openvk.api.proto.PluginValueSet
        public float floatValue(int r3, float r4) {
                r2 = this;
                android.util.SparseArray<java.lang.Object> r0 = r2.a
                java.lang.Object r0 = r0.get(r3)
                if (r0 != 0) goto L11
                com.bykv.vk.openvk.api.proto.PluginValueSet r1 = r2.b
                if (r1 == 0) goto L11
                float r3 = r1.floatValue(r3, r4)
                return r3
            L11:
                boolean r3 = com.bykv.j.j.j.j.b.a(r0)
                if (r3 == 0) goto L1f
                java.util.function.Supplier r3 = com.bykv.j.j.j.j.c.a(r0)
                java.lang.Object r0 = com.bykv.j.j.j.j.d.a(r3)
            L1f:
                boolean r3 = r0 instanceof java.lang.Float
                if (r3 == 0) goto L2a
                java.lang.Float r0 = (java.lang.Float) r0
                float r3 = r0.floatValue()
                return r3
            L2a:
                return r4
        }

        @Override // com.bykv.vk.openvk.api.proto.PluginValueSet
        public int intValue(int r2) {
                r1 = this;
                r0 = 0
                int r2 = r1.intValue(r2, r0)
                return r2
        }

        @Override // com.bykv.vk.openvk.api.proto.PluginValueSet
        public int intValue(int r3, int r4) {
                r2 = this;
                android.util.SparseArray<java.lang.Object> r0 = r2.a
                java.lang.Object r0 = r0.get(r3)
                if (r0 != 0) goto L11
                com.bykv.vk.openvk.api.proto.PluginValueSet r1 = r2.b
                if (r1 == 0) goto L11
                int r3 = r1.intValue(r3, r4)
                return r3
            L11:
                boolean r3 = com.bykv.j.j.j.j.b.a(r0)
                if (r3 == 0) goto L1f
                java.util.function.Supplier r3 = com.bykv.j.j.j.j.c.a(r0)
                java.lang.Object r0 = com.bykv.j.j.j.j.d.a(r3)
            L1f:
                boolean r3 = r0 instanceof java.lang.Integer
                if (r3 == 0) goto L2a
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r3 = r0.intValue()
                return r3
            L2a:
                return r4
        }

        @Override // com.bykv.vk.openvk.api.proto.PluginValueSet
        public boolean isEmpty() {
                r1 = this;
                int r0 = r1.size()
                if (r0 > 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        @Override // com.bykv.vk.openvk.api.proto.PluginValueSet
        public java.util.Set<java.lang.Integer> keys() {
                r4 = this;
                android.util.SparseArray<java.lang.Object> r0 = r4.a
                int r0 = r0.size()
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                r2 = 0
            Lc:
                if (r2 >= r0) goto L1e
                android.util.SparseArray<java.lang.Object> r3 = r4.a
                int r3 = r3.keyAt(r2)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1.add(r3)
                int r2 = r2 + 1
                goto Lc
            L1e:
                com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r4.b
                if (r0 == 0) goto L29
                java.util.Set r0 = r0.keys()
                r1.addAll(r0)
            L29:
                int r0 = r1.size()
                r4.c = r0
                return r1
        }

        @Override // com.bykv.vk.openvk.api.proto.PluginValueSet
        public long longValue(int r3) {
                r2 = this;
                r0 = 0
                long r0 = r2.longValue(r3, r0)
                return r0
        }

        @Override // com.bykv.vk.openvk.api.proto.PluginValueSet
        public long longValue(int r3, long r4) {
                r2 = this;
                android.util.SparseArray<java.lang.Object> r0 = r2.a
                java.lang.Object r0 = r0.get(r3)
                if (r0 != 0) goto L11
                com.bykv.vk.openvk.api.proto.PluginValueSet r1 = r2.b
                if (r1 == 0) goto L11
                long r3 = r1.longValue(r3, r4)
                return r3
            L11:
                boolean r3 = com.bykv.j.j.j.j.b.a(r0)
                if (r3 == 0) goto L1f
                java.util.function.Supplier r3 = com.bykv.j.j.j.j.c.a(r0)
                java.lang.Object r0 = com.bykv.j.j.j.j.d.a(r3)
            L1f:
                boolean r3 = r0 instanceof java.lang.Long
                if (r3 == 0) goto L2a
                java.lang.Long r0 = (java.lang.Long) r0
                long r3 = r0.longValue()
                return r3
            L2a:
                return r4
        }

        @Override // com.bykv.vk.openvk.api.proto.PluginValueSet
        public <T> T objectValue(int r3, java.lang.Class<T> r4) {
                r2 = this;
                android.util.SparseArray<java.lang.Object> r0 = r2.a
                java.lang.Object r0 = r0.get(r3)
                r1 = 0
                if (r0 != 0) goto L13
                com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.b
                if (r0 == 0) goto L12
                java.lang.Object r3 = r0.objectValue(r3, r4)
                return r3
            L12:
                return r1
            L13:
                boolean r3 = r2.b(r0)
                if (r3 == 0) goto L21
                java.util.function.Supplier r3 = com.bykv.j.j.j.j.c.a(r0)
                java.lang.Object r0 = com.bykv.j.j.j.j.d.a(r3)
            L21:
                boolean r3 = r4.isInstance(r0)
                if (r3 == 0) goto L28
                return r0
            L28:
                return r1
        }

        @Override // com.bykv.vk.openvk.api.proto.PluginValueSet
        public void remove(int r2) {
                r1 = this;
                android.util.SparseArray<java.lang.Object> r0 = r1.a
                r0.remove(r2)
                return
        }

        @Override // com.bykv.vk.openvk.api.proto.PluginValueSet
        public int size() {
                r1 = this;
                int r0 = r1.c
                if (r0 >= 0) goto L7
                r1.keys()
            L7:
                int r0 = r1.c
                return r0
        }

        @Override // com.bykv.vk.openvk.api.proto.PluginValueSet
        public android.util.SparseArray<java.lang.Object> sparseArray() {
                r6 = this;
                q0.a r0 = q0.a.a()
                int r0 = r0.c()
                r1 = 6803(0x1a93, float:9.533E-42)
                if (r0 >= r1) goto L18
                boolean r0 = r6.c()
                if (r0 == 0) goto L18
                com.bytedance.sdk.openadsdk.i.xt.j r0 = new com.bytedance.sdk.openadsdk.i.xt.j
                r0.<init>(r6)
                return r0
            L18:
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                com.bykv.vk.openvk.api.proto.PluginValueSet r1 = r6.b
                r2 = 0
                if (r1 == 0) goto L43
                android.util.SparseArray r1 = r1.sparseArray()
                if (r1 == 0) goto L43
                int r3 = r1.size()
                if (r3 <= 0) goto L43
                r3 = 0
            L2f:
                int r4 = r1.size()
                if (r3 >= r4) goto L43
                int r4 = r1.keyAt(r3)
                java.lang.Object r5 = r1.valueAt(r3)
                r0.put(r4, r5)
                int r3 = r3 + 1
                goto L2f
            L43:
                android.util.SparseArray<java.lang.Object> r1 = r6.a
                if (r1 == 0) goto L67
                int r1 = r1.size()
                if (r1 <= 0) goto L67
            L4d:
                android.util.SparseArray<java.lang.Object> r1 = r6.a
                int r1 = r1.size()
                if (r2 >= r1) goto L67
                android.util.SparseArray<java.lang.Object> r1 = r6.a
                int r1 = r1.keyAt(r2)
                android.util.SparseArray<java.lang.Object> r3 = r6.a
                java.lang.Object r3 = r3.valueAt(r2)
                r0.put(r1, r3)
                int r2 = r2 + 1
                goto L4d
            L67:
                return r0
        }

        @Override // com.bykv.vk.openvk.api.proto.PluginValueSet
        public java.lang.String stringValue(int r2) {
                r1 = this;
                r0 = 0
                java.lang.String r2 = r1.stringValue(r2, r0)
                return r2
        }

        @Override // com.bykv.vk.openvk.api.proto.PluginValueSet
        public java.lang.String stringValue(int r3, java.lang.String r4) {
                r2 = this;
                android.util.SparseArray<java.lang.Object> r0 = r2.a
                java.lang.Object r0 = r0.get(r3)
                if (r0 != 0) goto L11
                com.bykv.vk.openvk.api.proto.PluginValueSet r1 = r2.b
                if (r1 == 0) goto L11
                java.lang.String r3 = r1.stringValue(r3, r4)
                return r3
            L11:
                boolean r3 = com.bykv.j.j.j.j.b.a(r0)
                if (r3 == 0) goto L1f
                java.util.function.Supplier r3 = com.bykv.j.j.j.j.c.a(r0)
                java.lang.Object r0 = com.bykv.j.j.j.j.d.a(r3)
            L1f:
                boolean r3 = r0 instanceof java.lang.String
                if (r3 == 0) goto L28
                java.lang.String r3 = r0.toString()
                return r3
            L28:
                return r4
        }
    }

    static {
            r0 = 0
            com.bykv.j.j.j.j.e r0 = b(r0)
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r0.k()
            com.bykv.j.j.j.j.e.c = r0
            com.bykv.j.j.j.j.e$b r0 = new com.bykv.j.j.j.j.e$b
            r1 = 0
            r0.<init>(r1)
            com.bykv.j.j.j.j.e.d = r0
            return
    }

    private e(android.util.SparseArray<java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L6
            goto Lb
        L6:
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
        Lb:
            r0.a = r1
            return
    }

    private e(android.util.SparseArray<java.lang.Object> r1, com.bykv.vk.openvk.api.proto.PluginValueSet r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static final com.bykv.j.j.j.j.e a() {
            com.bykv.j.j.j.j.e r0 = new com.bykv.j.j.j.j.e
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.<init>(r1)
            return r0
    }

    public static final com.bykv.j.j.j.j.e b(int r2) {
            com.bykv.j.j.j.j.e r0 = new com.bykv.j.j.j.j.e
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static final com.bykv.j.j.j.j.e i(android.util.SparseArray<java.lang.Object> r1) {
            com.bykv.j.j.j.j.e r0 = new com.bykv.j.j.j.j.e
            r0.<init>(r1)
            return r0
    }

    public static final com.bykv.j.j.j.j.e j(com.bykv.vk.openvk.api.proto.PluginValueSet r2) {
            com.bykv.j.j.j.j.e r0 = new com.bykv.j.j.j.j.e
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    public com.bykv.j.j.j.j.e c(int r2, double r3) {
            r1 = this;
            android.util.SparseArray<java.lang.Object> r0 = r1.a
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r0.put(r2, r3)
            return r1
    }

    public com.bykv.j.j.j.j.e d(int r2, float r3) {
            r1 = this;
            android.util.SparseArray<java.lang.Object> r0 = r1.a
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.put(r2, r3)
            return r1
    }

    public com.bykv.j.j.j.j.e e(int r2, int r3) {
            r1 = this;
            android.util.SparseArray<java.lang.Object> r0 = r1.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            return r1
    }

    public com.bykv.j.j.j.j.e f(int r2, java.lang.Object r3) {
            r1 = this;
            android.util.SparseArray<java.lang.Object> r0 = r1.a
            r0.put(r2, r3)
            return r1
    }

    public com.bykv.j.j.j.j.e g(int r2, java.lang.String r3) {
            r1 = this;
            android.util.SparseArray<java.lang.Object> r0 = r1.a
            r0.put(r2, r3)
            return r1
    }

    public com.bykv.j.j.j.j.e h(int r2, boolean r3) {
            r1 = this;
            android.util.SparseArray<java.lang.Object> r0 = r1.a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.put(r2, r3)
            return r1
    }

    public com.bykv.vk.openvk.api.proto.PluginValueSet k() {
            r4 = this;
            com.bykv.j.j.j.j.e$c r0 = new com.bykv.j.j.j.j.e$c
            android.util.SparseArray<java.lang.Object> r1 = r4.a
            com.bykv.vk.openvk.api.proto.PluginValueSet r2 = r4.b
            r3 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }
}
