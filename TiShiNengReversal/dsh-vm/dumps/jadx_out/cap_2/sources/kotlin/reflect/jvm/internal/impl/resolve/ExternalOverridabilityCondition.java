package kotlin.reflect.jvm.internal.impl.resolve;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface ExternalOverridabilityCondition {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Contract extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract> {
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract[] $VALUES = null;
        public static final kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract BOTH = null;
        public static final kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract CONFLICTS_ONLY = null;
        public static final kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract SUCCESS_ONLY = null;

        static {
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract r0 = new kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract
                java.lang.String r1 = "CONFLICTS_ONLY"
                r2 = 0
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY = r0
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract r1 = new kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract
                java.lang.String r3 = "SUCCESS_ONLY"
                r4 = 1
                r1.<init>(r3, r4)
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.SUCCESS_ONLY = r1
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract r3 = new kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract
                java.lang.String r5 = "BOTH"
                r6 = 2
                r3.<init>(r5, r6)
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.BOTH = r3
                r5 = 3
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract[] r5 = new kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.$VALUES = r5
                return
        }

        Contract(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract> r0 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract r1 = (kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract) r1
                return r1
        }

        public static kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract[] values() {
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract[] r0 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract[] r0 = (kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Result extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result> {
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result[] $VALUES = null;
        public static final kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result INCOMPATIBLE = null;
        public static final kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result OVERRIDABLE = null;
        public static final kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result UNKNOWN = null;

        static {
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r0 = new kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result
                java.lang.String r1 = "OVERRIDABLE"
                r2 = 0
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.OVERRIDABLE = r0
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r1 = new kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result
                java.lang.String r3 = "INCOMPATIBLE"
                r4 = 1
                r1.<init>(r3, r4)
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE = r1
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r3 = new kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result
                java.lang.String r5 = "UNKNOWN"
                r6 = 2
                r3.<init>(r5, r6)
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN = r3
                r5 = 3
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result[] r5 = new kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.$VALUES = r5
                return
        }

        Result(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result> r0 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r1 = (kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result) r1
                return r1
        }

        public static kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result[] values() {
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result[] r0 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result[] r0 = (kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result[]) r0
                return r0
        }
    }

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract a();

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.d r3);
}
