package androidx.emoji2.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.AnyThread
@androidx.annotation.RequiresApi(19)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MetadataRepo {
    private static final int DEFAULT_ROOT_SIZE = 1024;
    private static final java.lang.String S_TRACE_CREATE_REPO = "EmojiCompat.MetadataRepo.create";

    @androidx.annotation.NonNull
    private final char[] mEmojiCharArray;

    @androidx.annotation.NonNull
    private final androidx.emoji2.text.flatbuffer.MetadataList mMetadataList;

    @androidx.annotation.NonNull
    private final androidx.emoji2.text.MetadataRepo.Node mRootNode;

    @androidx.annotation.NonNull
    private final android.graphics.Typeface mTypeface;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    static class Node {
        private final android.util.SparseArray<androidx.emoji2.text.MetadataRepo.Node> mChildren;
        private androidx.emoji2.text.EmojiMetadata mData;

        private Node() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        Node(int r2) {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>(r2)
                r1.mChildren = r0
                return
        }

        androidx.emoji2.text.MetadataRepo.Node get(int r2) {
                r1 = this;
                android.util.SparseArray<androidx.emoji2.text.MetadataRepo$Node> r0 = r1.mChildren
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                java.lang.Object r2 = r0.get(r2)
                androidx.emoji2.text.MetadataRepo$Node r2 = (androidx.emoji2.text.MetadataRepo.Node) r2
                return r2
        }

        final androidx.emoji2.text.EmojiMetadata getData() {
                r1 = this;
                androidx.emoji2.text.EmojiMetadata r0 = r1.mData
                return r0
        }

        void put(@androidx.annotation.NonNull androidx.emoji2.text.EmojiMetadata r4, int r5, int r6) {
                r3 = this;
                int r0 = r4.getCodepointAt(r5)
                androidx.emoji2.text.MetadataRepo$Node r0 = r3.get(r0)
                if (r0 != 0) goto L18
                androidx.emoji2.text.MetadataRepo$Node r0 = new androidx.emoji2.text.MetadataRepo$Node
                r0.<init>()
                android.util.SparseArray<androidx.emoji2.text.MetadataRepo$Node> r1 = r3.mChildren
                int r2 = r4.getCodepointAt(r5)
                r1.put(r2, r0)
            L18:
                if (r6 <= r5) goto L20
                int r5 = r5 + 1
                r0.put(r4, r5, r6)
                return
            L20:
                r0.mData = r4
                return
        }
    }

    private MetadataRepo(@androidx.annotation.NonNull android.graphics.Typeface r2, @androidx.annotation.NonNull androidx.emoji2.text.flatbuffer.MetadataList r3) {
            r1 = this;
            r1.<init>()
            r1.mTypeface = r2
            r1.mMetadataList = r3
            androidx.emoji2.text.MetadataRepo$Node r2 = new androidx.emoji2.text.MetadataRepo$Node
            r0 = 1024(0x400, float:1.435E-42)
            r2.<init>(r0)
            r1.mRootNode = r2
            int r2 = r3.listLength()
            int r2 = r2 * 2
            char[] r2 = new char[r2]
            r1.mEmojiCharArray = r2
            r1.constructIndex(r3)
            return
    }

    private void constructIndex(androidx.emoji2.text.flatbuffer.MetadataList r6) {
            r5 = this;
            int r6 = r6.listLength()
            r0 = 0
        L5:
            if (r0 >= r6) goto L1d
            androidx.emoji2.text.EmojiMetadata r1 = new androidx.emoji2.text.EmojiMetadata
            r1.<init>(r5, r0)
            int r2 = r1.getId()
            char[] r3 = r5.mEmojiCharArray
            int r4 = r0 * 2
            java.lang.Character.toChars(r2, r3, r4)
            r5.put(r1)
            int r0 = r0 + 1
            goto L5
        L1d:
            return
    }

    @androidx.annotation.NonNull
    public static androidx.emoji2.text.MetadataRepo create(@androidx.annotation.NonNull android.content.res.AssetManager r2, @androidx.annotation.NonNull java.lang.String r3) throws java.io.IOException {
            java.lang.String r0 = "EmojiCompat.MetadataRepo.create"
            androidx.core.os.TraceCompat.beginSection(r0)     // Catch: java.lang.Throwable -> L16
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r2, r3)     // Catch: java.lang.Throwable -> L16
            androidx.emoji2.text.MetadataRepo r1 = new androidx.emoji2.text.MetadataRepo     // Catch: java.lang.Throwable -> L16
            androidx.emoji2.text.flatbuffer.MetadataList r2 = androidx.emoji2.text.MetadataListReader.read(r2, r3)     // Catch: java.lang.Throwable -> L16
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L16
            androidx.core.os.TraceCompat.endSection()
            return r1
        L16:
            r2 = move-exception
            androidx.core.os.TraceCompat.endSection()
            throw r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.TESTS})
    public static androidx.emoji2.text.MetadataRepo create(@androidx.annotation.NonNull android.graphics.Typeface r2) {
            java.lang.String r0 = "EmojiCompat.MetadataRepo.create"
            androidx.core.os.TraceCompat.beginSection(r0)     // Catch: java.lang.Throwable -> L13
            androidx.emoji2.text.MetadataRepo r0 = new androidx.emoji2.text.MetadataRepo     // Catch: java.lang.Throwable -> L13
            androidx.emoji2.text.flatbuffer.MetadataList r1 = new androidx.emoji2.text.flatbuffer.MetadataList     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L13
            androidx.core.os.TraceCompat.endSection()
            return r0
        L13:
            r2 = move-exception
            androidx.core.os.TraceCompat.endSection()
            throw r2
    }

    @androidx.annotation.NonNull
    public static androidx.emoji2.text.MetadataRepo create(@androidx.annotation.NonNull android.graphics.Typeface r1, @androidx.annotation.NonNull java.io.InputStream r2) throws java.io.IOException {
            java.lang.String r0 = "EmojiCompat.MetadataRepo.create"
            androidx.core.os.TraceCompat.beginSection(r0)     // Catch: java.lang.Throwable -> L12
            androidx.emoji2.text.MetadataRepo r0 = new androidx.emoji2.text.MetadataRepo     // Catch: java.lang.Throwable -> L12
            androidx.emoji2.text.flatbuffer.MetadataList r2 = androidx.emoji2.text.MetadataListReader.read(r2)     // Catch: java.lang.Throwable -> L12
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L12
            androidx.core.os.TraceCompat.endSection()
            return r0
        L12:
            r1 = move-exception
            androidx.core.os.TraceCompat.endSection()
            throw r1
    }

    @androidx.annotation.NonNull
    public static androidx.emoji2.text.MetadataRepo create(@androidx.annotation.NonNull android.graphics.Typeface r1, @androidx.annotation.NonNull java.nio.ByteBuffer r2) throws java.io.IOException {
            java.lang.String r0 = "EmojiCompat.MetadataRepo.create"
            androidx.core.os.TraceCompat.beginSection(r0)     // Catch: java.lang.Throwable -> L12
            androidx.emoji2.text.MetadataRepo r0 = new androidx.emoji2.text.MetadataRepo     // Catch: java.lang.Throwable -> L12
            androidx.emoji2.text.flatbuffer.MetadataList r2 = androidx.emoji2.text.MetadataListReader.read(r2)     // Catch: java.lang.Throwable -> L12
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L12
            androidx.core.os.TraceCompat.endSection()
            return r0
        L12:
            r1 = move-exception
            androidx.core.os.TraceCompat.endSection()
            throw r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public char[] getEmojiCharArray() {
            r1 = this;
            char[] r0 = r1.mEmojiCharArray
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public androidx.emoji2.text.flatbuffer.MetadataList getMetadataList() {
            r1 = this;
            androidx.emoji2.text.flatbuffer.MetadataList r0 = r1.mMetadataList
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    int getMetadataVersion() {
            r1 = this;
            androidx.emoji2.text.flatbuffer.MetadataList r0 = r1.mMetadataList
            int r0 = r0.version()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    androidx.emoji2.text.MetadataRepo.Node getRootNode() {
            r1 = this;
            androidx.emoji2.text.MetadataRepo$Node r0 = r1.mRootNode
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    android.graphics.Typeface getTypeface() {
            r1 = this;
            android.graphics.Typeface r0 = r1.mTypeface
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    @androidx.annotation.VisibleForTesting
    void put(@androidx.annotation.NonNull androidx.emoji2.text.EmojiMetadata r5) {
            r4 = this;
            java.lang.String r0 = "emoji metadata cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r5, r0)
            int r0 = r5.getCodepointsLength()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.String r3 = "invalid metadata codepoint length"
            androidx.core.util.Preconditions.checkArgument(r0, r3)
            androidx.emoji2.text.MetadataRepo$Node r0 = r4.mRootNode
            int r3 = r5.getCodepointsLength()
            int r3 = r3 - r2
            r0.put(r5, r1, r3)
            return
    }
}
