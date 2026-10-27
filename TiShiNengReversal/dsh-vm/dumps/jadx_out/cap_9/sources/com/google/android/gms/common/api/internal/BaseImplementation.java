package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class BaseImplementation {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static abstract class ApiMethodImpl<R extends com.google.android.gms.common.api.Result, A extends com.google.android.gms.common.api.Api.AnyClient> extends com.google.android.gms.common.api.internal.BasePendingResult<R> implements com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<R> {

        @androidx.annotation.Nullable
        @com.google.android.gms.common.annotation.KeepForSdk
        private final com.google.android.gms.common.api.Api<?> api;

        @com.google.android.gms.common.annotation.KeepForSdk
        private final com.google.android.gms.common.api.Api.AnyClientKey<A> clientKey;

        @com.google.android.gms.common.annotation.KeepForSdk
        @java.lang.Deprecated
        protected ApiMethodImpl(@androidx.annotation.NonNull com.google.android.gms.common.api.Api.AnyClientKey<A> r2, @androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient r3) {
                r1 = this;
                java.lang.String r0 = "GoogleApiClient must not be null"
                java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
                com.google.android.gms.common.api.GoogleApiClient r3 = (com.google.android.gms.common.api.GoogleApiClient) r3
                r1.<init>(r3)
                java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
                com.google.android.gms.common.api.Api$AnyClientKey r2 = (com.google.android.gms.common.api.Api.AnyClientKey) r2
                r1.clientKey = r2
                r2 = 0
                r1.api = r2
                return
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        protected ApiMethodImpl(@androidx.annotation.NonNull com.google.android.gms.common.api.Api<?> r2, @androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient r3) {
                r1 = this;
                java.lang.String r0 = "GoogleApiClient must not be null"
                java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
                com.google.android.gms.common.api.GoogleApiClient r3 = (com.google.android.gms.common.api.GoogleApiClient) r3
                r1.<init>(r3)
                java.lang.String r3 = "Api must not be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r3)
                com.google.android.gms.common.api.Api$AnyClientKey r3 = r2.zab()
                r1.clientKey = r3
                r1.api = r2
                return
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        @androidx.annotation.VisibleForTesting
        protected ApiMethodImpl(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler<R> r1) {
                r0 = this;
                r0.<init>(r1)
                com.google.android.gms.common.api.Api$AnyClientKey r1 = new com.google.android.gms.common.api.Api$AnyClientKey
                r1.<init>()
                r0.clientKey = r1
                r1 = 0
                r0.api = r1
                return
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        private void setFailedResult(@androidx.annotation.NonNull android.os.RemoteException r4) {
                r3 = this;
                com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
                java.lang.String r4 = r4.getLocalizedMessage()
                r1 = 0
                r2 = 8
                r0.<init>(r2, r4, r1)
                r3.setFailedResult(r0)
                return
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        protected abstract void doExecute(@androidx.annotation.NonNull A r1) throws android.os.RemoteException;

        @androidx.annotation.Nullable
        @com.google.android.gms.common.annotation.KeepForSdk
        public final com.google.android.gms.common.api.Api<?> getApi() {
                r1 = this;
                com.google.android.gms.common.api.Api<?> r0 = r1.api
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public final com.google.android.gms.common.api.Api.AnyClientKey<A> getClientKey() {
                r1 = this;
                com.google.android.gms.common.api.Api$AnyClientKey<A extends com.google.android.gms.common.api.Api$AnyClient> r0 = r1.clientKey
                return r0
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        protected void onSetFailedResult(@androidx.annotation.NonNull R r1) {
                r0 = this;
                return
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public final void run(@androidx.annotation.NonNull A r1) throws android.os.DeadObjectException {
                r0 = this;
                r0.doExecute(r1)     // Catch: android.os.RemoteException -> L4 android.os.DeadObjectException -> L9
                return
            L4:
                r1 = move-exception
                r0.setFailedResult(r1)
                return
            L9:
                r1 = move-exception
                r0.setFailedResult(r1)
                throw r1
        }

        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        @com.google.android.gms.common.annotation.KeepForSdk
        public final void setFailedResult(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r3) {
                r2 = this;
                boolean r0 = r3.isSuccess()
                r0 = r0 ^ 1
                java.lang.String r1 = "Failed result must not be success"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
                com.google.android.gms.common.api.Result r3 = r2.createFailedResult(r3)
                r2.setResult(r3)
                r2.onSetFailedResult(r3)
                return
        }

        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        @com.google.android.gms.common.annotation.KeepForSdk
        public /* bridge */ /* synthetic */ void setResult(@androidx.annotation.NonNull java.lang.Object r1) {
                r0 = this;
                com.google.android.gms.common.api.Result r1 = (com.google.android.gms.common.api.Result) r1
                super.setResult(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface ResultHolder<R> {
        @com.google.android.gms.common.annotation.KeepForSdk
        void setFailedResult(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r1);

        @com.google.android.gms.common.annotation.KeepForSdk
        void setResult(@androidx.annotation.NonNull R r1);
    }

    public BaseImplementation() {
            r0 = this;
            r0.<init>()
            return
    }
}
