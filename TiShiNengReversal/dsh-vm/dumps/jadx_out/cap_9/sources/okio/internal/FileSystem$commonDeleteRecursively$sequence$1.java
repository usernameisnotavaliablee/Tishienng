package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", i = {0}, l = {75}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"}, v = 1)
/* renamed from: okio.internal.-FileSystem$commonDeleteRecursively$sequence$1, reason: invalid class name */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class FileSystem$commonDeleteRecursively$sequence$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.o<? super okio.Path>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    final /* synthetic */ okio.Path $fileOrDirectory;
    final /* synthetic */ okio.FileSystem $this_commonDeleteRecursively;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    FileSystem$commonDeleteRecursively$sequence$1(okio.FileSystem r1, okio.Path r2, kotlin.coroutines.e<? super okio.internal.FileSystem$commonDeleteRecursively$sequence$1> r3) {
            r0 = this;
            r0.$this_commonDeleteRecursively = r1
            r0.$fileOrDirectory = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r4, kotlin.coroutines.e<?> r5) {
            r3 = this;
            okio.internal.-FileSystem$commonDeleteRecursively$sequence$1 r0 = new okio.internal.-FileSystem$commonDeleteRecursively$sequence$1
            okio.FileSystem r1 = r3.$this_commonDeleteRecursively
            okio.Path r2 = r3.$fileOrDirectory
            r0.<init>(r1, r2, r5)
            r0.L$0 = r4
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlin.sequences.o r1 = (kotlin.sequences.o) r1
            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    public final java.lang.Object invoke(kotlin.sequences.o<? super okio.Path> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            okio.internal.-FileSystem$commonDeleteRecursively$sequence$1 r1 = (okio.internal.FileSystem$commonDeleteRecursively$sequence$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            r8 = this;
            java.lang.Object r0 = r8.L$0
            r1 = r0
            kotlin.sequences.o r1 = (kotlin.sequences.o) r1
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r8.label
            r3 = 1
            if (r2 == 0) goto L1c
            if (r2 != r3) goto L14
            kotlin.g0.n(r9)
            goto L3b
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            kotlin.g0.n(r9)
            okio.FileSystem r2 = r8.$this_commonDeleteRecursively
            r9 = 1
            kotlin.collections.m r3 = new kotlin.collections.m
            r3.<init>()
            okio.Path r4 = r8.$fileOrDirectory
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.j.a(r1)
            r8.L$0 = r5
            r8.label = r9
            r5 = 0
            r6 = 1
            r7 = r8
            java.lang.Object r9 = okio.internal.FileSystem.collectRecursively(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L3b
            return r0
        L3b:
            kotlin.n1 r9 = kotlin.n1.a
            return r9
    }
}
