package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class WorkQuery {
    private final java.util.List<java.util.UUID> mIds;
    private final java.util.List<androidx.work.WorkInfo.State> mStates;
    private final java.util.List<java.lang.String> mTags;
    private final java.util.List<java.lang.String> mUniqueWorkNames;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        java.util.List<java.util.UUID> mIds;
        java.util.List<androidx.work.WorkInfo.State> mStates;
        java.util.List<java.lang.String> mTags;
        java.util.List<java.lang.String> mUniqueWorkNames;

        private Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mIds = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mUniqueWorkNames = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mTags = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mStates = r0
                return
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public static androidx.work.WorkQuery.Builder fromIds(@androidx.annotation.NonNull java.util.List<java.util.UUID> r1) {
                androidx.work.WorkQuery$Builder r0 = new androidx.work.WorkQuery$Builder
                r0.<init>()
                r0.addIds(r1)
                return r0
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public static androidx.work.WorkQuery.Builder fromStates(@androidx.annotation.NonNull java.util.List<androidx.work.WorkInfo.State> r1) {
                androidx.work.WorkQuery$Builder r0 = new androidx.work.WorkQuery$Builder
                r0.<init>()
                r0.addStates(r1)
                return r0
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public static androidx.work.WorkQuery.Builder fromTags(@androidx.annotation.NonNull java.util.List<java.lang.String> r1) {
                androidx.work.WorkQuery$Builder r0 = new androidx.work.WorkQuery$Builder
                r0.<init>()
                r0.addTags(r1)
                return r0
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"BuilderSetStyle"})
        public static androidx.work.WorkQuery.Builder fromUniqueWorkNames(@androidx.annotation.NonNull java.util.List<java.lang.String> r1) {
                androidx.work.WorkQuery$Builder r0 = new androidx.work.WorkQuery$Builder
                r0.<init>()
                r0.addUniqueWorkNames(r1)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.work.WorkQuery.Builder addIds(@androidx.annotation.NonNull java.util.List<java.util.UUID> r2) {
                r1 = this;
                java.util.List<java.util.UUID> r0 = r1.mIds
                r0.addAll(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.work.WorkQuery.Builder addStates(@androidx.annotation.NonNull java.util.List<androidx.work.WorkInfo.State> r2) {
                r1 = this;
                java.util.List<androidx.work.WorkInfo$State> r0 = r1.mStates
                r0.addAll(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.work.WorkQuery.Builder addTags(@androidx.annotation.NonNull java.util.List<java.lang.String> r2) {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.mTags
                r0.addAll(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.work.WorkQuery.Builder addUniqueWorkNames(@androidx.annotation.NonNull java.util.List<java.lang.String> r2) {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.mUniqueWorkNames
                r0.addAll(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.work.WorkQuery build() {
                r2 = this;
                java.util.List<java.util.UUID> r0 = r2.mIds
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L29
                java.util.List<java.lang.String> r0 = r2.mUniqueWorkNames
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L29
                java.util.List<java.lang.String> r0 = r2.mTags
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L29
                java.util.List<androidx.work.WorkInfo$State> r0 = r2.mStates
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L21
                goto L29
            L21:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Must specify ids, uniqueNames, tags or states when building a WorkQuery"
                r0.<init>(r1)
                throw r0
            L29:
                androidx.work.WorkQuery r0 = new androidx.work.WorkQuery
                r0.<init>(r2)
                return r0
        }
    }

    WorkQuery(@androidx.annotation.NonNull androidx.work.WorkQuery.Builder r2) {
            r1 = this;
            r1.<init>()
            java.util.List<java.util.UUID> r0 = r2.mIds
            r1.mIds = r0
            java.util.List<java.lang.String> r0 = r2.mUniqueWorkNames
            r1.mUniqueWorkNames = r0
            java.util.List<java.lang.String> r0 = r2.mTags
            r1.mTags = r0
            java.util.List<androidx.work.WorkInfo$State> r2 = r2.mStates
            r1.mStates = r2
            return
    }

    @androidx.annotation.NonNull
    public java.util.List<java.util.UUID> getIds() {
            r1 = this;
            java.util.List<java.util.UUID> r0 = r1.mIds
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.work.WorkInfo.State> getStates() {
            r1 = this;
            java.util.List<androidx.work.WorkInfo$State> r0 = r1.mStates
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<java.lang.String> getTags() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.mTags
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<java.lang.String> getUniqueWorkNames() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.mUniqueWorkNames
            return r0
    }
}
