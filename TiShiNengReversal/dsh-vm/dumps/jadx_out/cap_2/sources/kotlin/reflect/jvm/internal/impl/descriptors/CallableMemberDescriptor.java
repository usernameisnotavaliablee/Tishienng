package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface CallableMemberDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.c0 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Kind extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind> {
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind[] $VALUES = null;
        public static final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind DECLARATION = null;
        public static final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind DELEGATION = null;
        public static final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind FAKE_OVERRIDE = null;
        public static final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind SYNTHESIZED = null;

        static {
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r0 = new kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind
                java.lang.String r1 = "DECLARATION"
                r2 = 0
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION = r0
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r1 = new kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind
                java.lang.String r3 = "FAKE_OVERRIDE"
                r4 = 1
                r1.<init>(r3, r4)
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE = r1
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r3 = new kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind
                java.lang.String r5 = "DELEGATION"
                r6 = 2
                r3.<init>(r5, r6)
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DELEGATION = r3
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r5 = new kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind
                java.lang.String r7 = "SYNTHESIZED"
                r8 = 3
                r5.<init>(r7, r8)
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED = r5
                r7 = 4
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind[] r7 = new kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.$VALUES = r7
                return
        }

        Kind(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind> r0 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r1 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind) r1
                return r1
        }

        public static kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind[] values() {
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind[] r0 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind[] r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind[]) r0
                return r0
        }

        public boolean isReal() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r0 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
                if (r1 == r0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }
    }

    void R(@org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r1);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> e();

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor e0(kotlin.reflect.jvm.internal.impl.descriptors.k r1, kotlin.reflect.jvm.internal.impl.descriptors.Modality r2, kotlin.reflect.jvm.internal.impl.descriptors.s r3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r4, boolean r5);

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind h();
}
