package com.umeng.analytics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum Gender extends java.lang.Enum<com.umeng.analytics.Gender> {
    public static final com.umeng.analytics.Gender Female = null;
    public static final com.umeng.analytics.Gender Male = null;
    public static final com.umeng.analytics.Gender Unknown = null;
    private static final /* synthetic */ com.umeng.analytics.Gender[] a = null;
    public int value;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.analytics.Gender$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a = null;

        static {
                com.umeng.analytics.Gender[] r0 = com.umeng.analytics.Gender.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.umeng.analytics.Gender.AnonymousClass4.a = r0
                com.umeng.analytics.Gender r1 = com.umeng.analytics.Gender.Male     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.umeng.analytics.Gender.AnonymousClass4.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.umeng.analytics.Gender r1 = com.umeng.analytics.Gender.Female     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.umeng.analytics.Gender.AnonymousClass4.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.umeng.analytics.Gender r1 = com.umeng.analytics.Gender.Unknown     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass4() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            com.umeng.analytics.Gender$1 r0 = new com.umeng.analytics.Gender$1
            java.lang.String r1 = "Male"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            com.umeng.analytics.Gender.Male = r0
            com.umeng.analytics.Gender$2 r1 = new com.umeng.analytics.Gender$2
            java.lang.String r4 = "Female"
            r5 = 2
            r1.<init>(r4, r3, r5)
            com.umeng.analytics.Gender.Female = r1
            com.umeng.analytics.Gender$3 r4 = new com.umeng.analytics.Gender$3
            java.lang.String r6 = "Unknown"
            r4.<init>(r6, r5, r2)
            com.umeng.analytics.Gender.Unknown = r4
            r6 = 3
            com.umeng.analytics.Gender[] r6 = new com.umeng.analytics.Gender[r6]
            r6[r2] = r0
            r6[r3] = r1
            r6[r5] = r4
            com.umeng.analytics.Gender.a = r6
            return
    }

    Gender(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    /* synthetic */ Gender(java.lang.String r1, int r2, int r3, com.umeng.analytics.Gender.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public static com.umeng.analytics.Gender getGender(int r1) {
            r0 = 1
            if (r1 == r0) goto Lc
            r0 = 2
            if (r1 == r0) goto L9
            com.umeng.analytics.Gender r1 = com.umeng.analytics.Gender.Unknown
            return r1
        L9:
            com.umeng.analytics.Gender r1 = com.umeng.analytics.Gender.Female
            return r1
        Lc:
            com.umeng.analytics.Gender r1 = com.umeng.analytics.Gender.Male
            return r1
    }

    public static com.umeng.commonsdk.statistics.proto.Gender transGender(com.umeng.analytics.Gender r1) {
            int[] r0 = com.umeng.analytics.Gender.AnonymousClass4.a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L14
            r0 = 2
            if (r1 == r0) goto L11
            com.umeng.commonsdk.statistics.proto.Gender r1 = com.umeng.commonsdk.statistics.proto.Gender.UNKNOWN
            return r1
        L11:
            com.umeng.commonsdk.statistics.proto.Gender r1 = com.umeng.commonsdk.statistics.proto.Gender.FEMALE
            return r1
        L14:
            com.umeng.commonsdk.statistics.proto.Gender r1 = com.umeng.commonsdk.statistics.proto.Gender.MALE
            return r1
    }

    public static com.umeng.analytics.Gender valueOf(java.lang.String r1) {
            java.lang.Class<com.umeng.analytics.Gender> r0 = com.umeng.analytics.Gender.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.umeng.analytics.Gender r1 = (com.umeng.analytics.Gender) r1
            return r1
    }

    public static com.umeng.analytics.Gender[] values() {
            com.umeng.analytics.Gender[] r0 = com.umeng.analytics.Gender.a
            java.lang.Object r0 = r0.clone()
            com.umeng.analytics.Gender[] r0 = (com.umeng.analytics.Gender[]) r0
            return r0
    }

    public int value() {
            r1 = this;
            int r0 = r1.value
            return r0
    }
}
