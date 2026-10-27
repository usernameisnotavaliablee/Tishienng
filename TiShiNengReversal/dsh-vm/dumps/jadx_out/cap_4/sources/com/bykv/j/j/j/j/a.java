package com.bykv.j.j.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    public static final com.bykv.vk.openvk.api.proto.ValueSet c = null;
    public static final com.bykv.vk.openvk.api.proto.Bridge d = null;
    public static final java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> e = null;
    private final android.util.SparseArray<java.lang.Object> a;
    private com.bykv.vk.openvk.api.proto.ValueSet b;

    /* renamed from: com.bykv.j.j.j.j.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0169a {
        public C0169a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class b implements com.bykv.vk.openvk.api.proto.ValueSet {
        private final android.util.SparseArray<java.lang.Object> a;
        private com.bykv.vk.openvk.api.proto.ValueSet b;
        private int c;

        private b(android.util.SparseArray<java.lang.Object> r2, com.bykv.vk.openvk.api.proto.ValueSet r3) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.c = r0
                r1.a = r2
                r1.b = r3
                return
        }

        /* synthetic */ b(android.util.SparseArray r1, com.bykv.vk.openvk.api.proto.ValueSet r2, com.bykv.j.j.j.j.a.C0169a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public <T> T[] arrayValue(int r4, java.lang.Class<T> r5) {
                r3 = this;
                android.util.SparseArray<java.lang.Object> r0 = r3.a
                java.lang.Object r0 = r0.get(r4)
                r1 = 0
                if (r0 != 0) goto L13
                com.bykv.vk.openvk.api.proto.ValueSet r0 = r3.b
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

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public boolean booleanValue(int r2) {
                r1 = this;
                r0 = 0
                boolean r2 = r1.booleanValue(r2, r0)
                return r2
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public boolean booleanValue(int r3, boolean r4) {
                r2 = this;
                android.util.SparseArray<java.lang.Object> r0 = r2.a
                java.lang.Object r0 = r0.get(r3)
                if (r0 != 0) goto L11
                com.bykv.vk.openvk.api.proto.ValueSet r1 = r2.b
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

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public boolean containsKey(int r3) {
                r2 = this;
                android.util.SparseArray<java.lang.Object> r0 = r2.a
                int r0 = r0.indexOfKey(r3)
                if (r0 >= 0) goto L11
                com.bykv.vk.openvk.api.proto.ValueSet r1 = r2.b
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

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public double doubleValue(int r3) {
                r2 = this;
                android.util.SparseArray<java.lang.Object> r0 = r2.a
                java.lang.Object r0 = r0.get(r3)
                if (r0 != 0) goto L11
                com.bykv.vk.openvk.api.proto.ValueSet r1 = r2.b
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

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public float floatValue(int r2) {
                r1 = this;
                r0 = 0
                float r2 = r1.floatValue(r2, r0)
                return r2
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public float floatValue(int r3, float r4) {
                r2 = this;
                android.util.SparseArray<java.lang.Object> r0 = r2.a
                java.lang.Object r0 = r0.get(r3)
                if (r0 != 0) goto L11
                com.bykv.vk.openvk.api.proto.ValueSet r1 = r2.b
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

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public int intValue(int r2) {
                r1 = this;
                r0 = 0
                int r2 = r1.intValue(r2, r0)
                return r2
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public int intValue(int r3, int r4) {
                r2 = this;
                android.util.SparseArray<java.lang.Object> r0 = r2.a
                java.lang.Object r0 = r0.get(r3)
                if (r0 != 0) goto L11
                com.bykv.vk.openvk.api.proto.ValueSet r1 = r2.b
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

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
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

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
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
                com.bykv.vk.openvk.api.proto.ValueSet r0 = r4.b
                if (r0 == 0) goto L29
                java.util.Set r0 = r0.keys()
                r1.addAll(r0)
            L29:
                int r0 = r1.size()
                r4.c = r0
                return r1
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public long longValue(int r3) {
                r2 = this;
                r0 = 0
                long r0 = r2.longValue(r3, r0)
                return r0
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public long longValue(int r3, long r4) {
                r2 = this;
                android.util.SparseArray<java.lang.Object> r0 = r2.a
                java.lang.Object r0 = r0.get(r3)
                if (r0 != 0) goto L11
                com.bykv.vk.openvk.api.proto.ValueSet r1 = r2.b
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

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public <T> T objectValue(int r3, java.lang.Class<T> r4) {
                r2 = this;
                android.util.SparseArray<java.lang.Object> r0 = r2.a
                java.lang.Object r0 = r0.get(r3)
                r1 = 0
                if (r0 != 0) goto L13
                com.bykv.vk.openvk.api.proto.ValueSet r0 = r2.b
                if (r0 == 0) goto L12
                java.lang.Object r3 = r0.objectValue(r3, r4)
                return r3
            L12:
                return r1
            L13:
                boolean r3 = com.bykv.j.j.j.j.b.a(r0)
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

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public void remove(int r2) {
                r1 = this;
                android.util.SparseArray<java.lang.Object> r0 = r1.a
                r0.remove(r2)
                return
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public int size() {
                r1 = this;
                int r0 = r1.c
                if (r0 >= 0) goto L7
                r1.keys()
            L7:
                int r0 = r1.c
                return r0
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public android.util.SparseArray<java.lang.Object> sparseArray() {
                r6 = this;
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                com.bykv.vk.openvk.api.proto.ValueSet r1 = r6.b
                r2 = 0
                if (r1 == 0) goto L2b
                android.util.SparseArray r1 = r1.sparseArray()
                if (r1 == 0) goto L2b
                int r3 = r1.size()
                if (r3 <= 0) goto L2b
                r3 = 0
            L17:
                int r4 = r1.size()
                if (r3 >= r4) goto L2b
                int r4 = r1.keyAt(r3)
                java.lang.Object r5 = r1.valueAt(r3)
                r0.put(r4, r5)
                int r3 = r3 + 1
                goto L17
            L2b:
                android.util.SparseArray<java.lang.Object> r1 = r6.a
                if (r1 == 0) goto L4f
                int r1 = r1.size()
                if (r1 <= 0) goto L4f
            L35:
                android.util.SparseArray<java.lang.Object> r1 = r6.a
                int r1 = r1.size()
                if (r2 >= r1) goto L4f
                android.util.SparseArray<java.lang.Object> r1 = r6.a
                int r1 = r1.keyAt(r2)
                android.util.SparseArray<java.lang.Object> r3 = r6.a
                java.lang.Object r3 = r3.valueAt(r2)
                r0.put(r1, r3)
                int r2 = r2 + 1
                goto L35
            L4f:
                return r0
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public java.lang.String stringValue(int r2) {
                r1 = this;
                r0 = 0
                java.lang.String r2 = r1.stringValue(r2, r0)
                return r2
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public java.lang.String stringValue(int r3, java.lang.String r4) {
                r2 = this;
                android.util.SparseArray<java.lang.Object> r0 = r2.a
                java.lang.Object r0 = r0.get(r3)
                if (r0 != 0) goto L11
                com.bykv.vk.openvk.api.proto.ValueSet r1 = r2.b
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

    private static final class c implements com.bykv.vk.openvk.api.proto.Bridge {
        private c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ c(com.bykv.j.j.j.j.a.C0169a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int r1, com.bykv.vk.openvk.api.proto.ValueSet r2, java.lang.Class<T> r3) {
                r0 = this;
                java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                if (r3 == r1) goto L49
                java.lang.Class r1 = java.lang.Boolean.TYPE
                if (r3 != r1) goto L9
                goto L49
            L9:
                java.lang.Class r1 = java.lang.Integer.TYPE
                if (r3 == r1) goto L43
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                if (r3 != r1) goto L12
                goto L43
            L12:
                java.lang.Class r1 = java.lang.Long.TYPE
                if (r3 == r1) goto L3c
                java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
                if (r3 != r1) goto L1b
                goto L3c
            L1b:
                java.lang.Class r1 = java.lang.Double.TYPE
                if (r3 == r1) goto L35
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                if (r3 != r1) goto L24
                goto L35
            L24:
                java.lang.Class r1 = java.lang.Float.TYPE
                if (r3 == r1) goto L2f
                java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
                if (r3 != r1) goto L2d
                goto L2f
            L2d:
                r1 = 0
                return r1
            L2f:
                r1 = 0
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                return r1
            L35:
                r1 = 0
                java.lang.Double r1 = java.lang.Double.valueOf(r1)
                return r1
            L3c:
                r1 = 0
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                return r1
            L43:
                r1 = 0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                return r1
            L49:
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                return r1
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public com.bykv.vk.openvk.api.proto.ValueSet values() {
                r1 = this;
                com.bykv.vk.openvk.api.proto.ValueSet r0 = com.bykv.j.j.j.j.a.c
                return r0
        }
    }

    @android.annotation.TargetApi(24)
    private static final class d<T, R> implements java.util.function.Function<T, R> {
        private d() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ d(com.bykv.j.j.j.j.a.C0169a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.function.Function
        public R apply(T r3) {
                r2 = this;
                boolean r0 = r3 instanceof android.util.SparseArray
                r1 = 0
                if (r0 == 0) goto L5b
                android.util.SparseArray r3 = (android.util.SparseArray) r3
                r0 = -99999985(0xfffffffffa0a1f0f, float:-1.7929173E35)
                java.lang.Object r3 = r3.get(r0)
                java.lang.Class r3 = (java.lang.Class) r3
                java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
                if (r3 == r0) goto L58
                java.lang.Class r0 = java.lang.Boolean.TYPE
                if (r3 != r0) goto L19
                goto L58
            L19:
                java.lang.Class r0 = java.lang.Integer.TYPE
                if (r3 == r0) goto L52
                java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
                if (r3 != r0) goto L22
                goto L52
            L22:
                java.lang.Class r0 = java.lang.Long.TYPE
                if (r3 == r0) goto L4b
                java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
                if (r3 != r0) goto L2b
                goto L4b
            L2b:
                java.lang.Class r0 = java.lang.Double.TYPE
                if (r3 == r0) goto L44
                java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
                if (r3 != r0) goto L34
                goto L44
            L34:
                java.lang.Class r0 = java.lang.Float.TYPE
                if (r3 == r0) goto L3e
                java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
                if (r3 != r0) goto L3d
                goto L3e
            L3d:
                return r1
            L3e:
                r3 = 0
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                return r3
            L44:
                r0 = 0
                java.lang.Double r3 = java.lang.Double.valueOf(r0)
                return r3
            L4b:
                r0 = 0
                java.lang.Long r3 = java.lang.Long.valueOf(r0)
                return r3
            L52:
                r3 = 0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                return r3
            L58:
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                return r3
            L5b:
                return r1
        }
    }

    static {
            r0 = 0
            com.bykv.j.j.j.j.a r0 = b(r0)
            com.bykv.vk.openvk.api.proto.ValueSet r0 = r0.k()
            com.bykv.j.j.j.j.a.c = r0
            com.bykv.j.j.j.j.a$c r0 = new com.bykv.j.j.j.j.a$c
            r1 = 0
            r0.<init>(r1)
            com.bykv.j.j.j.j.a.d = r0
            com.bykv.j.j.j.j.a$d r0 = new com.bykv.j.j.j.j.a$d
            r0.<init>(r1)
            com.bykv.j.j.j.j.a.e = r0
            return
    }

    private a(android.util.SparseArray<java.lang.Object> r1) {
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

    public static final com.bykv.j.j.j.j.a a() {
            com.bykv.j.j.j.j.a r0 = new com.bykv.j.j.j.j.a
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.<init>(r1)
            return r0
    }

    public static final com.bykv.j.j.j.j.a b(int r2) {
            com.bykv.j.j.j.j.a r0 = new com.bykv.j.j.j.j.a
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static final com.bykv.j.j.j.j.a j(android.util.SparseArray<java.lang.Object> r1) {
            com.bykv.j.j.j.j.a r0 = new com.bykv.j.j.j.j.a
            r0.<init>(r1)
            return r0
    }

    public com.bykv.j.j.j.j.a c(int r2, double r3) {
            r1 = this;
            android.util.SparseArray<java.lang.Object> r0 = r1.a
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r0.put(r2, r3)
            return r1
    }

    public com.bykv.j.j.j.j.a d(int r2, float r3) {
            r1 = this;
            android.util.SparseArray<java.lang.Object> r0 = r1.a
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.put(r2, r3)
            return r1
    }

    public com.bykv.j.j.j.j.a e(int r2, int r3) {
            r1 = this;
            android.util.SparseArray<java.lang.Object> r0 = r1.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            return r1
    }

    public com.bykv.j.j.j.j.a f(int r2, long r3) {
            r1 = this;
            android.util.SparseArray<java.lang.Object> r0 = r1.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.put(r2, r3)
            return r1
    }

    public com.bykv.j.j.j.j.a g(int r2, java.lang.Object r3) {
            r1 = this;
            android.util.SparseArray<java.lang.Object> r0 = r1.a
            r0.put(r2, r3)
            return r1
    }

    public com.bykv.j.j.j.j.a h(int r2, java.lang.String r3) {
            r1 = this;
            android.util.SparseArray<java.lang.Object> r0 = r1.a
            r0.put(r2, r3)
            return r1
    }

    public com.bykv.j.j.j.j.a i(int r2, boolean r3) {
            r1 = this;
            android.util.SparseArray<java.lang.Object> r0 = r1.a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.put(r2, r3)
            return r1
    }

    public com.bykv.vk.openvk.api.proto.ValueSet k() {
            r4 = this;
            com.bykv.j.j.j.j.a$b r0 = new com.bykv.j.j.j.j.a$b
            android.util.SparseArray<java.lang.Object> r1 = r4.a
            com.bykv.vk.openvk.api.proto.ValueSet r2 = r4.b
            r3 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }
}
