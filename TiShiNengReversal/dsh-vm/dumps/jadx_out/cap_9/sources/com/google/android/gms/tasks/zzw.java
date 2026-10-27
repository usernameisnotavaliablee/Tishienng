package com.google.android.gms.tasks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzw<TResult> extends com.google.android.gms.tasks.Task<TResult> {
    private final java.lang.Object zza;
    private final com.google.android.gms.tasks.zzr zzb;
    private boolean zzc;
    private volatile boolean zzd;

    @androidx.annotation.Nullable
    private java.lang.Object zze;
    private java.lang.Exception zzf;

    zzw() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            com.google.android.gms.tasks.zzr r0 = new com.google.android.gms.tasks.zzr
            r0.<init>()
            r1.zzb = r0
            return
    }

    private final void zzf() {
            r2 = this;
            boolean r0 = r2.zzc
            java.lang.String r1 = "Task is not yet complete"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            return
    }

    private final void zzg() {
            r2 = this;
            boolean r0 = r2.zzd
            if (r0 != 0) goto L5
            return
        L5:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Task is already canceled."
            r0.<init>(r1)
            throw r0
    }

    private final void zzh() {
            r1 = this;
            boolean r0 = r1.zzc
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = com.google.android.gms.tasks.DuplicateTaskCompletionException.of(r1)
            throw r0
    }

    private final void zzi() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            boolean r1 = r2.zzc     // Catch: java.lang.Throwable -> L9
            if (r1 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r1 = move-exception
            goto L12
        Lb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            com.google.android.gms.tasks.zzr r0 = r2.zzb
            r0.zzb(r2)
            return
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    @Override // com.google.android.gms.tasks.Task
    @androidx.annotation.NonNull
    public final com.google.android.gms.tasks.Task<TResult> addOnCanceledListener(@androidx.annotation.NonNull android.app.Activity r3, @androidx.annotation.NonNull com.google.android.gms.tasks.OnCanceledListener r4) {
            r2 = this;
            com.google.android.gms.tasks.zzh r0 = new com.google.android.gms.tasks.zzh
            java.util.concurrent.Executor r1 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD
            r0.<init>(r1, r4)
            com.google.android.gms.tasks.zzr r4 = r2.zzb
            r4.zza(r0)
            com.google.android.gms.tasks.zzv r3 = com.google.android.gms.tasks.zzv.zza(r3)
            r3.zzb(r0)
            r2.zzi()
            return r2
    }

    @Override // com.google.android.gms.tasks.Task
    @androidx.annotation.NonNull
    public final com.google.android.gms.tasks.Task<TResult> addOnCanceledListener(@androidx.annotation.NonNull com.google.android.gms.tasks.OnCanceledListener r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD
            r1.addOnCanceledListener(r0, r2)
            return r1
    }

    @Override // com.google.android.gms.tasks.Task
    @androidx.annotation.NonNull
    public final com.google.android.gms.tasks.Task<TResult> addOnCanceledListener(@androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull com.google.android.gms.tasks.OnCanceledListener r3) {
            r1 = this;
            com.google.android.gms.tasks.zzh r0 = new com.google.android.gms.tasks.zzh
            r0.<init>(r2, r3)
            com.google.android.gms.tasks.zzr r2 = r1.zzb
            r2.zza(r0)
            r1.zzi()
            return r1
    }

    @Override // com.google.android.gms.tasks.Task
    @androidx.annotation.NonNull
    public final com.google.android.gms.tasks.Task<TResult> addOnCompleteListener(@androidx.annotation.NonNull android.app.Activity r3, @androidx.annotation.NonNull com.google.android.gms.tasks.OnCompleteListener<TResult> r4) {
            r2 = this;
            com.google.android.gms.tasks.zzj r0 = new com.google.android.gms.tasks.zzj
            java.util.concurrent.Executor r1 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD
            r0.<init>(r1, r4)
            com.google.android.gms.tasks.zzr r4 = r2.zzb
            r4.zza(r0)
            com.google.android.gms.tasks.zzv r3 = com.google.android.gms.tasks.zzv.zza(r3)
            r3.zzb(r0)
            r2.zzi()
            return r2
    }

    @Override // com.google.android.gms.tasks.Task
    @androidx.annotation.NonNull
    public final com.google.android.gms.tasks.Task<TResult> addOnCompleteListener(@androidx.annotation.NonNull com.google.android.gms.tasks.OnCompleteListener<TResult> r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD
            com.google.android.gms.tasks.zzj r1 = new com.google.android.gms.tasks.zzj
            r1.<init>(r0, r3)
            com.google.android.gms.tasks.zzr r3 = r2.zzb
            r3.zza(r1)
            r2.zzi()
            return r2
    }

    @Override // com.google.android.gms.tasks.Task
    @androidx.annotation.NonNull
    public final com.google.android.gms.tasks.Task<TResult> addOnCompleteListener(@androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull com.google.android.gms.tasks.OnCompleteListener<TResult> r3) {
            r1 = this;
            com.google.android.gms.tasks.zzj r0 = new com.google.android.gms.tasks.zzj
            r0.<init>(r2, r3)
            com.google.android.gms.tasks.zzr r2 = r1.zzb
            r2.zza(r0)
            r1.zzi()
            return r1
    }

    @Override // com.google.android.gms.tasks.Task
    @androidx.annotation.NonNull
    public final com.google.android.gms.tasks.Task<TResult> addOnFailureListener(@androidx.annotation.NonNull android.app.Activity r3, @androidx.annotation.NonNull com.google.android.gms.tasks.OnFailureListener r4) {
            r2 = this;
            com.google.android.gms.tasks.zzl r0 = new com.google.android.gms.tasks.zzl
            java.util.concurrent.Executor r1 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD
            r0.<init>(r1, r4)
            com.google.android.gms.tasks.zzr r4 = r2.zzb
            r4.zza(r0)
            com.google.android.gms.tasks.zzv r3 = com.google.android.gms.tasks.zzv.zza(r3)
            r3.zzb(r0)
            r2.zzi()
            return r2
    }

    @Override // com.google.android.gms.tasks.Task
    @androidx.annotation.NonNull
    public final com.google.android.gms.tasks.Task<TResult> addOnFailureListener(@androidx.annotation.NonNull com.google.android.gms.tasks.OnFailureListener r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD
            r1.addOnFailureListener(r0, r2)
            return r1
    }

    @Override // com.google.android.gms.tasks.Task
    @androidx.annotation.NonNull
    public final com.google.android.gms.tasks.Task<TResult> addOnFailureListener(@androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull com.google.android.gms.tasks.OnFailureListener r3) {
            r1 = this;
            com.google.android.gms.tasks.zzl r0 = new com.google.android.gms.tasks.zzl
            r0.<init>(r2, r3)
            com.google.android.gms.tasks.zzr r2 = r1.zzb
            r2.zza(r0)
            r1.zzi()
            return r1
    }

    @Override // com.google.android.gms.tasks.Task
    @androidx.annotation.NonNull
    public final com.google.android.gms.tasks.Task<TResult> addOnSuccessListener(@androidx.annotation.NonNull android.app.Activity r3, @androidx.annotation.NonNull com.google.android.gms.tasks.OnSuccessListener<? super TResult> r4) {
            r2 = this;
            com.google.android.gms.tasks.zzn r0 = new com.google.android.gms.tasks.zzn
            java.util.concurrent.Executor r1 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD
            r0.<init>(r1, r4)
            com.google.android.gms.tasks.zzr r4 = r2.zzb
            r4.zza(r0)
            com.google.android.gms.tasks.zzv r3 = com.google.android.gms.tasks.zzv.zza(r3)
            r3.zzb(r0)
            r2.zzi()
            return r2
    }

    @Override // com.google.android.gms.tasks.Task
    @androidx.annotation.NonNull
    public final com.google.android.gms.tasks.Task<TResult> addOnSuccessListener(@androidx.annotation.NonNull com.google.android.gms.tasks.OnSuccessListener<? super TResult> r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD
            r1.addOnSuccessListener(r0, r2)
            return r1
    }

    @Override // com.google.android.gms.tasks.Task
    @androidx.annotation.NonNull
    public final com.google.android.gms.tasks.Task<TResult> addOnSuccessListener(@androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull com.google.android.gms.tasks.OnSuccessListener<? super TResult> r3) {
            r1 = this;
            com.google.android.gms.tasks.zzn r0 = new com.google.android.gms.tasks.zzn
            r0.<init>(r2, r3)
            com.google.android.gms.tasks.zzr r2 = r1.zzb
            r2.zza(r0)
            r1.zzi()
            return r1
    }

    @Override // com.google.android.gms.tasks.Task
    @androidx.annotation.NonNull
    public final <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWith(@androidx.annotation.NonNull com.google.android.gms.tasks.Continuation<TResult, TContinuationResult> r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD
            com.google.android.gms.tasks.Task r2 = r1.continueWith(r0, r2)
            return r2
    }

    @Override // com.google.android.gms.tasks.Task
    @androidx.annotation.NonNull
    public final <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWith(@androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull com.google.android.gms.tasks.Continuation<TResult, TContinuationResult> r4) {
            r2 = this;
            com.google.android.gms.tasks.zzw r0 = new com.google.android.gms.tasks.zzw
            r0.<init>()
            com.google.android.gms.tasks.zzd r1 = new com.google.android.gms.tasks.zzd
            r1.<init>(r3, r4, r0)
            com.google.android.gms.tasks.zzr r3 = r2.zzb
            r3.zza(r1)
            r2.zzi()
            return r0
    }

    @Override // com.google.android.gms.tasks.Task
    @androidx.annotation.NonNull
    public final <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWithTask(@androidx.annotation.NonNull com.google.android.gms.tasks.Continuation<TResult, com.google.android.gms.tasks.Task<TContinuationResult>> r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD
            com.google.android.gms.tasks.Task r2 = r1.continueWithTask(r0, r2)
            return r2
    }

    @Override // com.google.android.gms.tasks.Task
    @androidx.annotation.NonNull
    public final <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWithTask(@androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull com.google.android.gms.tasks.Continuation<TResult, com.google.android.gms.tasks.Task<TContinuationResult>> r4) {
            r2 = this;
            com.google.android.gms.tasks.zzw r0 = new com.google.android.gms.tasks.zzw
            r0.<init>()
            com.google.android.gms.tasks.zzf r1 = new com.google.android.gms.tasks.zzf
            r1.<init>(r3, r4, r0)
            com.google.android.gms.tasks.zzr r3 = r2.zzb
            r3.zza(r1)
            r2.zzi()
            return r0
    }

    @Override // com.google.android.gms.tasks.Task
    @androidx.annotation.Nullable
    public final java.lang.Exception getException() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            java.lang.Exception r1 = r2.zzf     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // com.google.android.gms.tasks.Task
    public final TResult getResult() {
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            r3.zzf()     // Catch: java.lang.Throwable -> L11
            r3.zzg()     // Catch: java.lang.Throwable -> L11
            java.lang.Exception r1 = r3.zzf     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            java.lang.Object r1 = r3.zze     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r1 = move-exception
            goto L19
        L13:
            com.google.android.gms.tasks.RuntimeExecutionException r2 = new com.google.android.gms.tasks.RuntimeExecutionException     // Catch: java.lang.Throwable -> L11
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L11
            throw r2     // Catch: java.lang.Throwable -> L11
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    @Override // com.google.android.gms.tasks.Task
    public final <X extends java.lang.Throwable> TResult getResult(@androidx.annotation.NonNull java.lang.Class<X> r3) throws java.lang.Throwable {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            r2.zzf()     // Catch: java.lang.Throwable -> L19
            r2.zzg()     // Catch: java.lang.Throwable -> L19
            java.lang.Exception r1 = r2.zzf     // Catch: java.lang.Throwable -> L19
            boolean r1 = r3.isInstance(r1)     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L21
            java.lang.Exception r3 = r2.zzf     // Catch: java.lang.Throwable -> L19
            if (r3 != 0) goto L1b
            java.lang.Object r3 = r2.zze     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r3
        L19:
            r3 = move-exception
            goto L2a
        L1b:
            com.google.android.gms.tasks.RuntimeExecutionException r1 = new com.google.android.gms.tasks.RuntimeExecutionException     // Catch: java.lang.Throwable -> L19
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L19
            throw r1     // Catch: java.lang.Throwable -> L19
        L21:
            java.lang.Exception r1 = r2.zzf     // Catch: java.lang.Throwable -> L19
            java.lang.Object r3 = r3.cast(r1)     // Catch: java.lang.Throwable -> L19
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Throwable -> L19
            throw r3     // Catch: java.lang.Throwable -> L19
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            boolean r1 = r2.zzc     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            boolean r1 = r3.zzc     // Catch: java.lang.Throwable -> L12
            r2 = 0
            if (r1 == 0) goto L14
            boolean r1 = r3.zzd     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            java.lang.Exception r1 = r3.zzf     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            r2 = 1
            goto L14
        L12:
            r1 = move-exception
            goto L16
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r2
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    @Override // com.google.android.gms.tasks.Task
    @androidx.annotation.NonNull
    public final <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> onSuccessTask(@androidx.annotation.NonNull com.google.android.gms.tasks.SuccessContinuation<TResult, TContinuationResult> r4) {
            r3 = this;
            java.util.concurrent.Executor r0 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD
            com.google.android.gms.tasks.zzw r1 = new com.google.android.gms.tasks.zzw
            r1.<init>()
            com.google.android.gms.tasks.zzp r2 = new com.google.android.gms.tasks.zzp
            r2.<init>(r0, r4, r1)
            com.google.android.gms.tasks.zzr r4 = r3.zzb
            r4.zza(r2)
            r3.zzi()
            return r1
    }

    @Override // com.google.android.gms.tasks.Task
    @androidx.annotation.NonNull
    public final <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> onSuccessTask(java.util.concurrent.Executor r3, com.google.android.gms.tasks.SuccessContinuation<TResult, TContinuationResult> r4) {
            r2 = this;
            com.google.android.gms.tasks.zzw r0 = new com.google.android.gms.tasks.zzw
            r0.<init>()
            com.google.android.gms.tasks.zzp r1 = new com.google.android.gms.tasks.zzp
            r1.<init>(r3, r4, r0)
            com.google.android.gms.tasks.zzr r3 = r2.zzb
            r3.zza(r1)
            r2.zzi()
            return r0
    }

    public final void zza(@androidx.annotation.NonNull java.lang.Exception r3) {
            r2 = this;
            java.lang.String r0 = "Exception must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            r2.zzh()     // Catch: java.lang.Throwable -> L17
            r1 = 1
            r2.zzc = r1     // Catch: java.lang.Throwable -> L17
            r2.zzf = r3     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.tasks.zzr r3 = r2.zzb
            r3.zzb(r2)
            return
        L17:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    public final void zzb(@androidx.annotation.Nullable java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            r2.zzh()     // Catch: java.lang.Throwable -> L12
            r1 = 1
            r2.zzc = r1     // Catch: java.lang.Throwable -> L12
            r2.zze = r3     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.tasks.zzr r3 = r2.zzb
            r3.zzb(r2)
            return
        L12:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    public final boolean zzc() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            boolean r1 = r2.zzc     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            r0 = 0
            return r0
        La:
            r1 = move-exception
            goto L18
        Lc:
            r1 = 1
            r2.zzc = r1     // Catch: java.lang.Throwable -> La
            r2.zzd = r1     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            com.google.android.gms.tasks.zzr r0 = r2.zzb
            r0.zzb(r2)
            return r1
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    public final boolean zzd(@androidx.annotation.NonNull java.lang.Exception r3) {
            r2 = this;
            java.lang.String r0 = "Exception must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            boolean r1 = r2.zzc     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            r3 = 0
            return r3
        Lf:
            r3 = move-exception
            goto L1d
        L11:
            r1 = 1
            r2.zzc = r1     // Catch: java.lang.Throwable -> Lf
            r2.zzf = r3     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.tasks.zzr r3 = r2.zzb
            r3.zzb(r2)
            return r1
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    public final boolean zze(@androidx.annotation.Nullable java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            boolean r1 = r2.zzc     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            r3 = 0
            return r3
        La:
            r3 = move-exception
            goto L18
        Lc:
            r1 = 1
            r2.zzc = r1     // Catch: java.lang.Throwable -> La
            r2.zze = r3     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            com.google.android.gms.tasks.zzr r3 = r2.zzb
            r3.zzb(r2)
            return r1
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }
}
