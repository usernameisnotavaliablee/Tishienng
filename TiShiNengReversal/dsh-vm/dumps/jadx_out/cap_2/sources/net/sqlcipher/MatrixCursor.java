package net.sqlcipher;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class MatrixCursor extends net.sqlcipher.AbstractCursor {
    private final int columnCount;
    private final java.lang.String[] columnNames;
    private java.lang.Object[] data;
    private int rowCount;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class RowBuilder {
        private final int endIndex;
        private int index;
        final /* synthetic */ net.sqlcipher.MatrixCursor this$0;

        RowBuilder(net.sqlcipher.MatrixCursor r1, int r2, int r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.index = r2
                r0.endIndex = r3
                return
        }

        public net.sqlcipher.MatrixCursor.RowBuilder add(java.lang.Object r4) {
                r3 = this;
                int r0 = r3.index
                int r1 = r3.endIndex
                if (r0 == r1) goto L15
                net.sqlcipher.MatrixCursor r0 = r3.this$0
                java.lang.Object[] r0 = net.sqlcipher.MatrixCursor.access$000(r0)
                int r1 = r3.index
                int r2 = r1 + 1
                r3.index = r2
                r0[r1] = r4
                return r3
            L15:
                net.sqlcipher.CursorIndexOutOfBoundsException r4 = new net.sqlcipher.CursorIndexOutOfBoundsException
                java.lang.String r0 = "No more columns left."
                r4.<init>(r0)
                throw r4
        }
    }

    public MatrixCursor(java.lang.String[] r2) {
            r1 = this;
            r0 = 16
            r1.<init>(r2, r0)
            return
    }

    public MatrixCursor(java.lang.String[] r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.rowCount = r0
            r1.columnNames = r2
            int r2 = r2.length
            r1.columnCount = r2
            r0 = 1
            if (r3 >= r0) goto Lf
            r3 = 1
        Lf:
            int r2 = r2 * r3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.data = r2
            return
    }

    static /* synthetic */ java.lang.Object[] access$000(net.sqlcipher.MatrixCursor r0) {
            java.lang.Object[] r0 = r0.data
            return r0
    }

    private void addRow(java.util.ArrayList<?> r6, int r7) {
            r5 = this;
            int r0 = r6.size()
            int r1 = r5.columnCount
            if (r0 != r1) goto L1f
            int r1 = r5.rowCount
            int r1 = r1 + 1
            r5.rowCount = r1
            java.lang.Object[] r1 = r5.data
            r2 = 0
        L11:
            if (r2 >= r0) goto L1e
            int r3 = r7 + r2
            java.lang.Object r4 = r6.get(r2)
            r1[r3] = r4
            int r2 = r2 + 1
            goto L11
        L1e:
            return
        L1f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "columnNames.length = "
            r7.append(r1)
            int r1 = r5.columnCount
            r7.append(r1)
            java.lang.String r1 = ", columnValues.size() = "
            r7.append(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    private void ensureCapacity(int r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.data
            int r1 = r0.length
            if (r4 <= r1) goto L15
            int r1 = r0.length
            int r1 = r1 * 2
            if (r1 >= r4) goto Lb
            goto Lc
        Lb:
            r4 = r1
        Lc:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r3.data = r4
            int r1 = r0.length
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
        L15:
            return
    }

    private java.lang.Object get(int r4) {
            r3 = this;
            if (r4 < 0) goto L26
            int r0 = r3.columnCount
            if (r4 >= r0) goto L26
            int r1 = r3.mPos
            if (r1 < 0) goto L1e
            int r2 = r3.rowCount
            if (r1 >= r2) goto L16
            java.lang.Object[] r2 = r3.data
            int r1 = r1 * r0
            int r1 = r1 + r4
            r4 = r2[r1]
            return r4
        L16:
            net.sqlcipher.CursorIndexOutOfBoundsException r4 = new net.sqlcipher.CursorIndexOutOfBoundsException
            java.lang.String r0 = "After last row."
            r4.<init>(r0)
            throw r4
        L1e:
            net.sqlcipher.CursorIndexOutOfBoundsException r4 = new net.sqlcipher.CursorIndexOutOfBoundsException
            java.lang.String r0 = "Before first row."
            r4.<init>(r0)
            throw r4
        L26:
            net.sqlcipher.CursorIndexOutOfBoundsException r0 = new net.sqlcipher.CursorIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Requested column: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", # of columns: "
            r1.append(r4)
            int r4 = r3.columnCount
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public void addRow(java.lang.Iterable<?> r6) {
            r5 = this;
            int r0 = r5.rowCount
            int r1 = r5.columnCount
            int r0 = r0 * r1
            int r1 = r1 + r0
            r5.ensureCapacity(r1)
            boolean r2 = r6 instanceof java.util.ArrayList
            if (r2 == 0) goto L14
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r5.addRow(r6, r0)
            return
        L14:
            java.lang.Object[] r2 = r5.data
            java.util.Iterator r6 = r6.iterator()
        L1a:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r3 = r6.next()
            if (r0 == r1) goto L2c
            int r4 = r0 + 1
            r2[r0] = r3
            r0 = r4
            goto L1a
        L2c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "columnValues.size() > columnNames.length"
            r6.<init>(r0)
            throw r6
        L34:
            if (r0 != r1) goto L3d
            int r6 = r5.rowCount
            int r6 = r6 + 1
            r5.rowCount = r6
            return
        L3d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "columnValues.size() < columnNames.length"
            r6.<init>(r0)
            throw r6
    }

    public void addRow(java.lang.Object[] r5) {
            r4 = this;
            int r0 = r5.length
            int r1 = r4.columnCount
            if (r0 != r1) goto L1a
            int r0 = r4.rowCount
            int r2 = r0 + 1
            r4.rowCount = r2
            int r0 = r0 * r1
            int r1 = r1 + r0
            r4.ensureCapacity(r1)
            java.lang.Object[] r1 = r4.data
            int r2 = r4.columnCount
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r1, r0, r2)
            return
        L1a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "columnNames.length = "
            r1.append(r2)
            int r2 = r4.columnCount
            r1.append(r2)
            java.lang.String r2 = ", columnValues.length = "
            r1.append(r2)
            int r5 = r5.length
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
            r1 = this;
            java.lang.String[] r0 = r1.columnNames
            return r0
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public int getCount() {
            r1 = this;
            int r0 = r1.rowCount
            return r0
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public double getDouble(int r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            if (r3 != 0) goto L9
            r0 = 0
            return r0
        L9:
            boolean r0 = r3 instanceof java.lang.Number
            if (r0 == 0) goto L14
            java.lang.Number r3 = (java.lang.Number) r3
            double r0 = r3.doubleValue()
            return r0
        L14:
            java.lang.String r3 = r3.toString()
            double r0 = java.lang.Double.parseDouble(r3)
            return r0
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public float getFloat(int r2) {
            r1 = this;
            java.lang.Object r2 = r1.get(r2)
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto L13
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            return r2
        L13:
            java.lang.String r2 = r2.toString()
            float r2 = java.lang.Float.parseFloat(r2)
            return r2
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public int getInt(int r2) {
            r1 = this;
            java.lang.Object r2 = r1.get(r2)
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto L13
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            return r2
        L13:
            java.lang.String r2 = r2.toString()
            int r2 = java.lang.Integer.parseInt(r2)
            return r2
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public long getLong(int r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            if (r3 != 0) goto L9
            r0 = 0
            return r0
        L9:
            boolean r0 = r3 instanceof java.lang.Number
            if (r0 == 0) goto L14
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            return r0
        L14:
            java.lang.String r3 = r3.toString()
            long r0 = java.lang.Long.parseLong(r3)
            return r0
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public short getShort(int r2) {
            r1 = this;
            java.lang.Object r2 = r1.get(r2)
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto L13
            java.lang.Number r2 = (java.lang.Number) r2
            short r2 = r2.shortValue()
            return r2
        L13:
            java.lang.String r2 = r2.toString()
            short r2 = java.lang.Short.parseShort(r2)
            return r2
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public java.lang.String getString(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor, net.sqlcipher.Cursor
    public int getType(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            int r1 = net.sqlcipher.DatabaseUtils.getTypeOfObject(r1)
            return r1
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public boolean isNull(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public net.sqlcipher.MatrixCursor.RowBuilder newRow() {
            r3 = this;
            int r0 = r3.rowCount
            int r0 = r0 + 1
            r3.rowCount = r0
            int r1 = r3.columnCount
            int r0 = r0 * r1
            r3.ensureCapacity(r0)
            int r1 = r3.columnCount
            int r1 = r0 - r1
            net.sqlcipher.MatrixCursor$RowBuilder r2 = new net.sqlcipher.MatrixCursor$RowBuilder
            r2.<init>(r3, r1, r0)
            return r2
    }
}
