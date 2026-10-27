package com.google.android.datatransport.runtime.dagger.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class MembersInjectors {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum NoOpMembersInjector extends java.lang.Enum<com.google.android.datatransport.runtime.dagger.internal.MembersInjectors.NoOpMembersInjector> implements com.google.android.datatransport.runtime.dagger.MembersInjector<java.lang.Object> {
        private static final /* synthetic */ com.google.android.datatransport.runtime.dagger.internal.MembersInjectors.NoOpMembersInjector[] $VALUES = null;
        public static final com.google.android.datatransport.runtime.dagger.internal.MembersInjectors.NoOpMembersInjector INSTANCE = null;

        static {
                com.google.android.datatransport.runtime.dagger.internal.MembersInjectors$NoOpMembersInjector r0 = new com.google.android.datatransport.runtime.dagger.internal.MembersInjectors$NoOpMembersInjector
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.android.datatransport.runtime.dagger.internal.MembersInjectors.NoOpMembersInjector.INSTANCE = r0
                r1 = 1
                com.google.android.datatransport.runtime.dagger.internal.MembersInjectors$NoOpMembersInjector[] r1 = new com.google.android.datatransport.runtime.dagger.internal.MembersInjectors.NoOpMembersInjector[r1]
                r1[r2] = r0
                com.google.android.datatransport.runtime.dagger.internal.MembersInjectors.NoOpMembersInjector.$VALUES = r1
                return
        }

        NoOpMembersInjector(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.android.datatransport.runtime.dagger.internal.MembersInjectors.NoOpMembersInjector valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.datatransport.runtime.dagger.internal.MembersInjectors$NoOpMembersInjector> r0 = com.google.android.datatransport.runtime.dagger.internal.MembersInjectors.NoOpMembersInjector.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.datatransport.runtime.dagger.internal.MembersInjectors$NoOpMembersInjector r1 = (com.google.android.datatransport.runtime.dagger.internal.MembersInjectors.NoOpMembersInjector) r1
                return r1
        }

        public static com.google.android.datatransport.runtime.dagger.internal.MembersInjectors.NoOpMembersInjector[] values() {
                com.google.android.datatransport.runtime.dagger.internal.MembersInjectors$NoOpMembersInjector[] r0 = com.google.android.datatransport.runtime.dagger.internal.MembersInjectors.NoOpMembersInjector.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.android.datatransport.runtime.dagger.internal.MembersInjectors$NoOpMembersInjector[] r0 = (com.google.android.datatransport.runtime.dagger.internal.MembersInjectors.NoOpMembersInjector[]) r0
                return r0
        }

        @Override // com.google.android.datatransport.runtime.dagger.MembersInjector
        public void injectMembers(java.lang.Object r2) {
                r1 = this;
                java.lang.String r0 = "Cannot inject members into a null reference"
                com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(r2, r0)
                return
        }
    }

    private MembersInjectors() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> com.google.android.datatransport.runtime.dagger.MembersInjector<T> noOp() {
            com.google.android.datatransport.runtime.dagger.internal.MembersInjectors$NoOpMembersInjector r0 = com.google.android.datatransport.runtime.dagger.internal.MembersInjectors.NoOpMembersInjector.INSTANCE
            return r0
    }
}
