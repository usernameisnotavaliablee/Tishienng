package androidx.recyclerview.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
interface StableIdStorage {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class IsolatedStableIdStorage implements androidx.recyclerview.widget.StableIdStorage {
        long mNextStableId;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class WrapperStableIdLookup implements androidx.recyclerview.widget.StableIdStorage.StableIdLookup {
            private final androidx.collection.LongSparseArray<java.lang.Long> mLocalToGlobalLookup;
            final /* synthetic */ androidx.recyclerview.widget.StableIdStorage.IsolatedStableIdStorage this$0;

            WrapperStableIdLookup(androidx.recyclerview.widget.StableIdStorage.IsolatedStableIdStorage r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    androidx.collection.LongSparseArray r1 = new androidx.collection.LongSparseArray
                    r1.<init>()
                    r0.mLocalToGlobalLookup = r1
                    return
            }

            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long r3) {
                    r2 = this;
                    androidx.collection.LongSparseArray<java.lang.Long> r0 = r2.mLocalToGlobalLookup
                    java.lang.Object r0 = r0.get(r3)
                    java.lang.Long r0 = (java.lang.Long) r0
                    if (r0 != 0) goto L19
                    androidx.recyclerview.widget.StableIdStorage$IsolatedStableIdStorage r0 = r2.this$0
                    long r0 = r0.obtainId()
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                    androidx.collection.LongSparseArray<java.lang.Long> r1 = r2.mLocalToGlobalLookup
                    r1.put(r3, r0)
                L19:
                    long r3 = r0.longValue()
                    return r3
            }
        }

        public IsolatedStableIdStorage() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.mNextStableId = r0
                return
        }

        @Override // androidx.recyclerview.widget.StableIdStorage
        @androidx.annotation.NonNull
        public androidx.recyclerview.widget.StableIdStorage.StableIdLookup createStableIdLookup() {
                r1 = this;
                androidx.recyclerview.widget.StableIdStorage$IsolatedStableIdStorage$WrapperStableIdLookup r0 = new androidx.recyclerview.widget.StableIdStorage$IsolatedStableIdStorage$WrapperStableIdLookup
                r0.<init>(r1)
                return r0
        }

        long obtainId() {
                r4 = this;
                long r0 = r4.mNextStableId
                r2 = 1
                long r2 = r2 + r0
                r4.mNextStableId = r2
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class NoStableIdStorage implements androidx.recyclerview.widget.StableIdStorage {
        private final androidx.recyclerview.widget.StableIdStorage.StableIdLookup mNoIdLookup;


        public NoStableIdStorage() {
                r1 = this;
                r1.<init>()
                androidx.recyclerview.widget.StableIdStorage$NoStableIdStorage$1 r0 = new androidx.recyclerview.widget.StableIdStorage$NoStableIdStorage$1
                r0.<init>(r1)
                r1.mNoIdLookup = r0
                return
        }

        @Override // androidx.recyclerview.widget.StableIdStorage
        @androidx.annotation.NonNull
        public androidx.recyclerview.widget.StableIdStorage.StableIdLookup createStableIdLookup() {
                r1 = this;
                androidx.recyclerview.widget.StableIdStorage$StableIdLookup r0 = r1.mNoIdLookup
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class SharedPoolStableIdStorage implements androidx.recyclerview.widget.StableIdStorage {
        private final androidx.recyclerview.widget.StableIdStorage.StableIdLookup mSameIdLookup;


        public SharedPoolStableIdStorage() {
                r1 = this;
                r1.<init>()
                androidx.recyclerview.widget.StableIdStorage$SharedPoolStableIdStorage$1 r0 = new androidx.recyclerview.widget.StableIdStorage$SharedPoolStableIdStorage$1
                r0.<init>(r1)
                r1.mSameIdLookup = r0
                return
        }

        @Override // androidx.recyclerview.widget.StableIdStorage
        @androidx.annotation.NonNull
        public androidx.recyclerview.widget.StableIdStorage.StableIdLookup createStableIdLookup() {
                r1 = this;
                androidx.recyclerview.widget.StableIdStorage$StableIdLookup r0 = r1.mSameIdLookup
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface StableIdLookup {
        long localToGlobal(long r1);
    }

    @androidx.annotation.NonNull
    androidx.recyclerview.widget.StableIdStorage.StableIdLookup createStableIdLookup();
}
