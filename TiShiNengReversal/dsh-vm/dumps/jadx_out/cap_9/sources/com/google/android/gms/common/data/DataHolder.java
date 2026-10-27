package com.google.android.gms.common.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.annotation.KeepName
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class DataHolder extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements java.io.Closeable {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.data.DataHolder> CREATOR = null;
    private static final com.google.android.gms.common.data.DataHolder.Builder zaf = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1000)
    final int zaa;
    android.os.Bundle zab;
    int[] zac;
    int zad;
    boolean zae;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getColumns", id = 1)
    private final java.lang.String[] zag;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getWindows", id = 2)
    private final android.database.CursorWindow[] zah;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getStatusCode", id = 3)
    private final int zai;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMetadata", id = 4)
    private final android.os.Bundle zaj;
    private boolean zak;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class Builder {
        private final java.lang.String[] zaa;
        private final java.util.ArrayList zab;
        private final java.util.HashMap zac;

        /* synthetic */ Builder(java.lang.String[] r1, java.lang.String r2, com.google.android.gms.common.data.zac r3) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                java.lang.String[] r1 = (java.lang.String[]) r1
                r0.zaa = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.zab = r1
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.zac = r1
                return
        }

        static /* bridge */ /* synthetic */ java.util.ArrayList zab(com.google.android.gms.common.data.DataHolder.Builder r0) {
                java.util.ArrayList r0 = r0.zab
                return r0
        }

        static /* bridge */ /* synthetic */ java.lang.String[] zac(com.google.android.gms.common.data.DataHolder.Builder r0) {
                java.lang.String[] r0 = r0.zaa
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.data.DataHolder build(int r3) {
                r2 = this;
                com.google.android.gms.common.data.DataHolder r0 = new com.google.android.gms.common.data.DataHolder
                r1 = 0
                r0.<init>(r2, r3, r1, r1)
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.data.DataHolder build(int r7, @androidx.annotation.NonNull android.os.Bundle r8) {
                r6 = this;
                com.google.android.gms.common.data.DataHolder r0 = new com.google.android.gms.common.data.DataHolder
                r4 = -1
                r5 = 0
                r1 = r6
                r2 = r7
                r3 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.data.DataHolder.Builder withRow(@androidx.annotation.NonNull android.content.ContentValues r4) {
                r3 = this;
                com.google.android.gms.common.internal.Asserts.checkNotNull(r4)
                java.util.HashMap r0 = new java.util.HashMap
                int r1 = r4.size()
                r0.<init>(r1)
                java.util.Set r4 = r4.valueSet()
                java.util.Iterator r4 = r4.iterator()
            L14:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L2e
                java.lang.Object r1 = r4.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r1 = r1.getValue()
                r0.put(r2, r1)
                goto L14
            L2e:
                com.google.android.gms.common.data.DataHolder$Builder r4 = r3.zaa(r0)
                return r4
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.gms.common.data.DataHolder.Builder zaa(@androidx.annotation.NonNull java.util.HashMap r2) {
                r1 = this;
                com.google.android.gms.common.internal.Asserts.checkNotNull(r2)
                java.util.ArrayList r0 = r1.zab
                r0.add(r2)
                return r1
        }
    }

    static {
            com.google.android.gms.common.data.zaf r0 = new com.google.android.gms.common.data.zaf
            r0.<init>()
            com.google.android.gms.common.data.DataHolder.CREATOR = r0
            com.google.android.gms.common.data.zab r0 = new com.google.android.gms.common.data.zab
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.gms.common.data.DataHolder.zaf = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    DataHolder(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1000) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String[] r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.database.CursorWindow[] r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r5, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) android.os.Bundle r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zae = r0
            r0 = 1
            r1.zak = r0
            r1.zaa = r2
            r1.zag = r3
            r1.zah = r4
            r1.zai = r5
            r1.zaj = r6
            return
    }

    public DataHolder(@androidx.annotation.NonNull android.database.Cursor r8, int r9, @androidx.annotation.Nullable android.os.Bundle r10) {
            r7 = this;
            com.google.android.gms.common.sqlite.CursorWrapper r0 = new com.google.android.gms.common.sqlite.CursorWrapper
            r0.<init>(r8)
            java.lang.String[] r8 = r0.getColumnNames()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L2e
            android.database.CursorWindow r3 = r0.getWindow()     // Catch: java.lang.Throwable -> L2e
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L30
            int r6 = r3.getStartPosition()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L30
            r3.acquireReference()     // Catch: java.lang.Throwable -> L2e
            r0.setWindow(r4)     // Catch: java.lang.Throwable -> L2e
            r1.add(r3)     // Catch: java.lang.Throwable -> L2e
            int r3 = r3.getNumRows()     // Catch: java.lang.Throwable -> L2e
            goto L31
        L2e:
            r8 = move-exception
            goto L78
        L30:
            r3 = 0
        L31:
            if (r3 >= r2) goto L65
            boolean r6 = r0.moveToPosition(r3)     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L65
            android.database.CursorWindow r6 = r0.getWindow()     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L46
            r6.acquireReference()     // Catch: java.lang.Throwable -> L2e
            r0.setWindow(r4)     // Catch: java.lang.Throwable -> L2e
            goto L51
        L46:
            android.database.CursorWindow r6 = new android.database.CursorWindow     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L2e
            r6.setStartPosition(r3)     // Catch: java.lang.Throwable -> L2e
            r0.fillWindow(r3, r6)     // Catch: java.lang.Throwable -> L2e
        L51:
            int r3 = r6.getNumRows()     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L58
            goto L65
        L58:
            r1.add(r6)     // Catch: java.lang.Throwable -> L2e
            int r3 = r6.getStartPosition()     // Catch: java.lang.Throwable -> L2e
            int r6 = r6.getNumRows()     // Catch: java.lang.Throwable -> L2e
            int r3 = r3 + r6
            goto L31
        L65:
            r0.close()
            int r0 = r1.size()
            android.database.CursorWindow[] r0 = new android.database.CursorWindow[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            android.database.CursorWindow[] r0 = (android.database.CursorWindow[]) r0
            r7.<init>(r8, r0, r9, r10)
            return
        L78:
            r0.close()
            throw r8
    }

    private DataHolder(com.google.android.gms.common.data.DataHolder.Builder r2, int r3, @androidx.annotation.Nullable android.os.Bundle r4) {
            r1 = this;
            java.lang.String[] r4 = com.google.android.gms.common.data.DataHolder.Builder.zac(r2)
            r0 = -1
            android.database.CursorWindow[] r2 = zaf(r2, r0)
            r0 = 0
            r1.<init>(r4, r2, r3, r0)
            return
    }

    /* synthetic */ DataHolder(com.google.android.gms.common.data.DataHolder.Builder r1, int r2, android.os.Bundle r3, int r4, com.google.android.gms.common.data.zae r5) {
            r0 = this;
            java.lang.String[] r4 = com.google.android.gms.common.data.DataHolder.Builder.zac(r1)
            r5 = -1
            android.database.CursorWindow[] r1 = zaf(r1, r5)
            r0.<init>(r4, r1, r2, r3)
            return
    }

    /* synthetic */ DataHolder(com.google.android.gms.common.data.DataHolder.Builder r1, int r2, android.os.Bundle r3, com.google.android.gms.common.data.zae r4) {
            r0 = this;
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public DataHolder(@androidx.annotation.NonNull java.lang.String[] r2, @androidx.annotation.NonNull android.database.CursorWindow[] r3, int r4, @androidx.annotation.Nullable android.os.Bundle r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zae = r0
            r0 = 1
            r1.zak = r0
            r1.zaa = r0
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r1.zag = r2
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            android.database.CursorWindow[] r2 = (android.database.CursorWindow[]) r2
            r1.zah = r2
            r1.zai = r4
            r1.zaj = r5
            r1.zad()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.data.DataHolder.Builder builder(@androidx.annotation.NonNull java.lang.String[] r2) {
            com.google.android.gms.common.data.DataHolder$Builder r0 = new com.google.android.gms.common.data.DataHolder$Builder
            r1 = 0
            r0.<init>(r2, r1, r1)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.data.DataHolder empty(int r3) {
            com.google.android.gms.common.data.DataHolder r0 = new com.google.android.gms.common.data.DataHolder
            com.google.android.gms.common.data.DataHolder$Builder r1 = com.google.android.gms.common.data.DataHolder.zaf
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    private final void zae(java.lang.String r2, int r3) {
            r1 = this;
            android.os.Bundle r0 = r1.zab
            if (r0 == 0) goto L27
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L27
            boolean r2 = r1.isClosed()
            if (r2 != 0) goto L1f
            if (r3 < 0) goto L17
            int r2 = r1.zad
            if (r3 >= r2) goto L17
            return
        L17:
            android.database.CursorIndexOutOfBoundsException r2 = new android.database.CursorIndexOutOfBoundsException
            int r0 = r1.zad
            r2.<init>(r3, r0)
            throw r2
        L1f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Buffer is closed."
            r2.<init>(r3)
            throw r2
        L27:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "No such column: "
            java.lang.String r2 = r0.concat(r2)
            r3.<init>(r2)
            throw r3
    }

    private static android.database.CursorWindow[] zaf(com.google.android.gms.common.data.DataHolder.Builder r12, int r13) {
            java.lang.String[] r13 = com.google.android.gms.common.data.DataHolder.Builder.zac(r12)
            int r13 = r13.length
            r0 = 0
            if (r13 != 0) goto Lb
            android.database.CursorWindow[] r12 = new android.database.CursorWindow[r0]
            return r12
        Lb:
            java.util.ArrayList r13 = com.google.android.gms.common.data.DataHolder.Builder.zab(r12)
            int r1 = r13.size()
            android.database.CursorWindow r2 = new android.database.CursorWindow
            r2.<init>(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r2)
            java.lang.String[] r4 = com.google.android.gms.common.data.DataHolder.Builder.zac(r12)
            int r4 = r4.length
            r2.setNumColumns(r4)
            r4 = 0
            r5 = 0
        L2a:
            if (r4 >= r1) goto L14f
            boolean r6 = r2.allocRow()     // Catch: java.lang.RuntimeException -> L5b
            if (r6 != 0) goto L5e
            android.database.CursorWindow r2 = new android.database.CursorWindow     // Catch: java.lang.RuntimeException -> L5b
            r2.<init>(r0)     // Catch: java.lang.RuntimeException -> L5b
            r2.setStartPosition(r4)     // Catch: java.lang.RuntimeException -> L5b
            java.lang.String[] r6 = com.google.android.gms.common.data.DataHolder.Builder.zac(r12)     // Catch: java.lang.RuntimeException -> L5b
            int r6 = r6.length     // Catch: java.lang.RuntimeException -> L5b
            r2.setNumColumns(r6)     // Catch: java.lang.RuntimeException -> L5b
            r3.add(r2)     // Catch: java.lang.RuntimeException -> L5b
            boolean r6 = r2.allocRow()     // Catch: java.lang.RuntimeException -> L5b
            if (r6 != 0) goto L5e
            r3.remove(r2)     // Catch: java.lang.RuntimeException -> L5b
            int r12 = r3.size()     // Catch: java.lang.RuntimeException -> L5b
            android.database.CursorWindow[] r12 = new android.database.CursorWindow[r12]     // Catch: java.lang.RuntimeException -> L5b
            java.lang.Object[] r12 = r3.toArray(r12)     // Catch: java.lang.RuntimeException -> L5b
            android.database.CursorWindow[] r12 = (android.database.CursorWindow[]) r12     // Catch: java.lang.RuntimeException -> L5b
            return r12
        L5b:
            r12 = move-exception
            goto L13c
        L5e:
            java.lang.Object r6 = r13.get(r4)     // Catch: java.lang.RuntimeException -> L5b
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.RuntimeException -> L5b
            r7 = 1
            r8 = 0
            r9 = 1
        L67:
            java.lang.String[] r10 = com.google.android.gms.common.data.DataHolder.Builder.zac(r12)     // Catch: java.lang.RuntimeException -> L5b
            int r10 = r10.length     // Catch: java.lang.RuntimeException -> L5b
            if (r8 >= r10) goto L112
            if (r9 == 0) goto L116
            java.lang.String[] r9 = com.google.android.gms.common.data.DataHolder.Builder.zac(r12)     // Catch: java.lang.RuntimeException -> L5b
            r9 = r9[r8]     // Catch: java.lang.RuntimeException -> L5b
            java.lang.Object r10 = r6.get(r9)     // Catch: java.lang.RuntimeException -> L5b
            if (r10 != 0) goto L82
            boolean r9 = r2.putNull(r4, r8)     // Catch: java.lang.RuntimeException -> L5b
            goto Leb
        L82:
            boolean r11 = r10 instanceof java.lang.String     // Catch: java.lang.RuntimeException -> L5b
            if (r11 == 0) goto L8d
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.RuntimeException -> L5b
            boolean r9 = r2.putString(r10, r4, r8)     // Catch: java.lang.RuntimeException -> L5b
            goto Leb
        L8d:
            boolean r11 = r10 instanceof java.lang.Long     // Catch: java.lang.RuntimeException -> L5b
            if (r11 == 0) goto L9c
            java.lang.Long r10 = (java.lang.Long) r10     // Catch: java.lang.RuntimeException -> L5b
            long r9 = r10.longValue()     // Catch: java.lang.RuntimeException -> L5b
            boolean r9 = r2.putLong(r9, r4, r8)     // Catch: java.lang.RuntimeException -> L5b
            goto Leb
        L9c:
            boolean r11 = r10 instanceof java.lang.Integer     // Catch: java.lang.RuntimeException -> L5b
            if (r11 == 0) goto Lac
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.RuntimeException -> L5b
            int r9 = r10.intValue()     // Catch: java.lang.RuntimeException -> L5b
            long r9 = (long) r9     // Catch: java.lang.RuntimeException -> L5b
            boolean r9 = r2.putLong(r9, r4, r8)     // Catch: java.lang.RuntimeException -> L5b
            goto Leb
        Lac:
            boolean r11 = r10 instanceof java.lang.Boolean     // Catch: java.lang.RuntimeException -> L5b
            if (r11 == 0) goto Lc2
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.RuntimeException -> L5b
            boolean r9 = r10.booleanValue()     // Catch: java.lang.RuntimeException -> L5b
            if (r7 == r9) goto Lbb
            r9 = 0
            goto Lbd
        Lbb:
            r9 = 1
        Lbd:
            boolean r9 = r2.putLong(r9, r4, r8)     // Catch: java.lang.RuntimeException -> L5b
            goto Leb
        Lc2:
            boolean r11 = r10 instanceof byte[]     // Catch: java.lang.RuntimeException -> L5b
            if (r11 == 0) goto Lcd
            byte[] r10 = (byte[]) r10     // Catch: java.lang.RuntimeException -> L5b
            boolean r9 = r2.putBlob(r10, r4, r8)     // Catch: java.lang.RuntimeException -> L5b
            goto Leb
        Lcd:
            boolean r11 = r10 instanceof java.lang.Double     // Catch: java.lang.RuntimeException -> L5b
            if (r11 == 0) goto Ldc
            java.lang.Double r10 = (java.lang.Double) r10     // Catch: java.lang.RuntimeException -> L5b
            double r9 = r10.doubleValue()     // Catch: java.lang.RuntimeException -> L5b
            boolean r9 = r2.putDouble(r9, r4, r8)     // Catch: java.lang.RuntimeException -> L5b
            goto Leb
        Ldc:
            boolean r11 = r10 instanceof java.lang.Float     // Catch: java.lang.RuntimeException -> L5b
            if (r11 == 0) goto Lef
            java.lang.Float r10 = (java.lang.Float) r10     // Catch: java.lang.RuntimeException -> L5b
            float r9 = r10.floatValue()     // Catch: java.lang.RuntimeException -> L5b
            double r9 = (double) r9     // Catch: java.lang.RuntimeException -> L5b
            boolean r9 = r2.putDouble(r9, r4, r8)     // Catch: java.lang.RuntimeException -> L5b
        Leb:
            int r8 = r8 + 1
            goto L67
        Lef:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.RuntimeException -> L5b
            java.lang.String r13 = r10.toString()     // Catch: java.lang.RuntimeException -> L5b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L5b
            r1.<init>()     // Catch: java.lang.RuntimeException -> L5b
            java.lang.String r2 = "Unsupported object for column "
            r1.append(r2)     // Catch: java.lang.RuntimeException -> L5b
            r1.append(r9)     // Catch: java.lang.RuntimeException -> L5b
            java.lang.String r2 = ": "
            r1.append(r2)     // Catch: java.lang.RuntimeException -> L5b
            r1.append(r13)     // Catch: java.lang.RuntimeException -> L5b
            java.lang.String r13 = r1.toString()     // Catch: java.lang.RuntimeException -> L5b
            r12.<init>(r13)     // Catch: java.lang.RuntimeException -> L5b
            throw r12     // Catch: java.lang.RuntimeException -> L5b
        L112:
            if (r9 == 0) goto L116
            r5 = 0
            goto L131
        L116:
            if (r5 != 0) goto L134
            r2.freeLastRow()     // Catch: java.lang.RuntimeException -> L5b
            android.database.CursorWindow r2 = new android.database.CursorWindow     // Catch: java.lang.RuntimeException -> L5b
            r2.<init>(r0)     // Catch: java.lang.RuntimeException -> L5b
            r2.setStartPosition(r4)     // Catch: java.lang.RuntimeException -> L5b
            java.lang.String[] r5 = com.google.android.gms.common.data.DataHolder.Builder.zac(r12)     // Catch: java.lang.RuntimeException -> L5b
            int r5 = r5.length     // Catch: java.lang.RuntimeException -> L5b
            r2.setNumColumns(r5)     // Catch: java.lang.RuntimeException -> L5b
            r3.add(r2)     // Catch: java.lang.RuntimeException -> L5b
            int r4 = r4 + (-1)
            r5 = 1
        L131:
            int r4 = r4 + r7
            goto L2a
        L134:
            java.lang.String r12 = "Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle."
            com.google.android.gms.common.data.zad r13 = new com.google.android.gms.common.data.zad     // Catch: java.lang.RuntimeException -> L5b
            r13.<init>(r12)     // Catch: java.lang.RuntimeException -> L5b
            throw r13     // Catch: java.lang.RuntimeException -> L5b
        L13c:
            int r13 = r3.size()
        L140:
            if (r0 >= r13) goto L14e
            java.lang.Object r1 = r3.get(r0)
            android.database.CursorWindow r1 = (android.database.CursorWindow) r1
            r1.close()
            int r0 = r0 + 1
            goto L140
        L14e:
            throw r12
        L14f:
            int r12 = r3.size()
            android.database.CursorWindow[] r12 = new android.database.CursorWindow[r12]
            java.lang.Object[] r12 = r3.toArray(r12)
            android.database.CursorWindow[] r12 = (android.database.CursorWindow[]) r12
            return r12
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @com.google.android.gms.common.annotation.KeepForSdk
    public void close() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zae     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            r0 = 1
            r3.zae = r0     // Catch: java.lang.Throwable -> L16
            r0 = 0
        L9:
            android.database.CursorWindow[] r1 = r3.zah     // Catch: java.lang.Throwable -> L16
            int r2 = r1.length     // Catch: java.lang.Throwable -> L16
            if (r0 >= r2) goto L18
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L16
            r1.close()     // Catch: java.lang.Throwable -> L16
            int r0 = r0 + 1
            goto L9
        L16:
            r0 = move-exception
            goto L1a
        L18:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L16
            return
        L1a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L16
            throw r0
    }

    protected final void finalize() throws java.lang.Throwable {
            r1 = this;
            boolean r0 = r1.zak     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            android.database.CursorWindow[] r0 = r1.zah     // Catch: java.lang.Throwable -> L13
            int r0 = r0.length     // Catch: java.lang.Throwable -> L13
            if (r0 <= 0) goto L15
            boolean r0 = r1.isClosed()     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L15
            r1.close()     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r0 = move-exception
            goto L19
        L15:
            super.finalize()
            return
        L19:
            super.finalize()
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean getBoolean(@androidx.annotation.NonNull java.lang.String r3, int r4, int r5) {
            r2 = this;
            r2.zae(r3, r4)
            android.database.CursorWindow[] r0 = r2.zah
            r5 = r0[r5]
            android.os.Bundle r0 = r2.zab
            int r3 = r0.getInt(r3)
            long r3 = r5.getLong(r4, r3)
            r0 = 1
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L19
            r3 = 1
            return r3
        L19:
            r3 = 0
            return r3
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public byte[] getByteArray(@androidx.annotation.NonNull java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r0 = r1.zab
            int r2 = r0.getInt(r2)
            byte[] r2 = r4.getBlob(r3, r2)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getCount() {
            r1 = this;
            int r0 = r1.zad
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getInteger(@androidx.annotation.NonNull java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r0 = r1.zab
            int r2 = r0.getInt(r2)
            int r2 = r4.getInt(r3, r2)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public long getLong(@androidx.annotation.NonNull java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r0 = r1.zab
            int r2 = r0.getInt(r2)
            long r2 = r4.getLong(r3, r2)
            return r2
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.os.Bundle getMetadata() {
            r1 = this;
            android.os.Bundle r0 = r1.zaj
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getStatusCode() {
            r1 = this;
            int r0 = r1.zai
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getString(@androidx.annotation.NonNull java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r0 = r1.zab
            int r2 = r0.getInt(r2)
            java.lang.String r2 = r4.getString(r3, r2)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getWindowIndex(int r4) {
            r3 = this;
            r0 = 0
            if (r4 < 0) goto L9
            int r1 = r3.zad
            if (r4 >= r1) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            com.google.android.gms.common.internal.Preconditions.checkState(r1)
        Ld:
            int[] r1 = r3.zac
            int r2 = r1.length
            if (r0 >= r2) goto L1c
            r1 = r1[r0]
            if (r4 >= r1) goto L19
            int r0 = r0 + (-1)
            goto L1c
        L19:
            int r0 = r0 + 1
            goto Ld
        L1c:
            if (r0 != r2) goto L20
            int r0 = r0 + (-1)
        L20:
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean hasColumn(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            android.os.Bundle r0 = r1.zab
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean hasNull(@androidx.annotation.NonNull java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r0 = r1.zab
            int r2 = r0.getInt(r2)
            boolean r2 = r4.isNull(r3, r2)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isClosed() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zae     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r6, int r7) {
            r5 = this;
            java.lang.String[] r0 = r5.zag
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r6)
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(r6, r2, r0, r3)
            r0 = 2
            android.database.CursorWindow[] r4 = r5.zah
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(r6, r0, r4, r7, r3)
            r0 = 3
            int r4 = r5.getStatusCode()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r0, r4)
            r0 = 4
            android.os.Bundle r4 = r5.getMetadata()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r6, r0, r4, r3)
            r0 = 1000(0x3e8, float:1.401E-42)
            int r3 = r5.zaa
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r0, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r6, r1)
            r6 = r7 & 1
            if (r6 == 0) goto L32
            r5.close()
        L32:
            return
    }

    public final double zaa(@androidx.annotation.NonNull java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r0 = r1.zab
            int r2 = r0.getInt(r2)
            double r2 = r4.getDouble(r3, r2)
            return r2
    }

    public final float zab(@androidx.annotation.NonNull java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r0 = r1.zab
            int r2 = r0.getInt(r2)
            float r2 = r4.getFloat(r3, r2)
            return r2
    }

    public final void zac(@androidx.annotation.NonNull java.lang.String r2, int r3, int r4, @androidx.annotation.NonNull android.database.CharArrayBuffer r5) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r0 = r1.zab
            int r2 = r0.getInt(r2)
            r4.copyStringToBuffer(r3, r2, r5)
            return
    }

    public final void zad() {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r4.zab = r0
            r0 = 0
            r1 = 0
        L9:
            java.lang.String[] r2 = r4.zag
            int r3 = r2.length
            if (r1 >= r3) goto L18
            android.os.Bundle r3 = r4.zab
            r2 = r2[r1]
            r3.putInt(r2, r1)
            int r1 = r1 + 1
            goto L9
        L18:
            android.database.CursorWindow[] r1 = r4.zah
            int r1 = r1.length
            int[] r1 = new int[r1]
            r4.zac = r1
            r1 = 0
        L20:
            android.database.CursorWindow[] r2 = r4.zah
            int r3 = r2.length
            if (r0 >= r3) goto L3e
            int[] r3 = r4.zac
            r3[r0] = r1
            r2 = r2[r0]
            int r2 = r2.getStartPosition()
            int r2 = r1 - r2
            android.database.CursorWindow[] r3 = r4.zah
            r3 = r3[r0]
            int r3 = r3.getNumRows()
            int r3 = r3 - r2
            int r1 = r1 + r3
            int r0 = r0 + 1
            goto L20
        L3e:
            r4.zad = r1
            return
    }
}
