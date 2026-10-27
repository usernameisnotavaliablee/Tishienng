package org.apache.commons.net.ftp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class FTPFile implements java.io.Serializable {
    public static final int DIRECTORY_TYPE = 1;
    public static final int EXECUTE_PERMISSION = 2;
    public static final int FILE_TYPE = 0;
    public static final int GROUP_ACCESS = 1;
    public static final int READ_PERMISSION = 0;
    public static final int SYMBOLIC_LINK_TYPE = 2;
    public static final int UNKNOWN_TYPE = 3;
    public static final int USER_ACCESS = 0;
    public static final int WORLD_ACCESS = 2;
    public static final int WRITE_PERMISSION = 1;
    private static final long serialVersionUID = 9010790363003271996L;
    private java.util.Calendar _date;
    private java.lang.String _group;
    private int _hardLinkCount;
    private java.lang.String _link;
    private java.lang.String _name;
    private final boolean[][] _permissions;
    private java.lang.String _rawListing;
    private long _size;
    private int _type;
    private java.lang.String _user;

    public FTPFile() {
            r4 = this;
            r4.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            r1 = 1
            r2 = 3
            r0[r1] = r2
            r1 = 0
            r0[r1] = r2
            java.lang.Class r3 = java.lang.Boolean.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r3, r0)
            boolean[][] r0 = (boolean[][]) r0
            r4._permissions = r0
            r4._type = r2
            r4._hardLinkCount = r1
            r0 = -1
            r4._size = r0
            java.lang.String r0 = ""
            r4._user = r0
            r4._group = r0
            r0 = 0
            r4._date = r0
            r4._name = r0
            return
    }

    FTPFile(java.lang.String r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3._permissions = r0
            r3._rawListing = r4
            r4 = 3
            r3._type = r4
            r4 = 0
            r3._hardLinkCount = r4
            r1 = -1
            r3._size = r1
            java.lang.String r4 = ""
            r3._user = r4
            r3._group = r4
            r3._date = r0
            r3._name = r0
            return
    }

    private char formatType() {
            r2 = this;
            int r0 = r2._type
            if (r0 == 0) goto L13
            r1 = 1
            if (r0 == r1) goto L10
            r1 = 2
            if (r0 == r1) goto Ld
            r0 = 63
            return r0
        Ld:
            r0 = 108(0x6c, float:1.51E-43)
            return r0
        L10:
            r0 = 100
            return r0
        L13:
            r0 = 45
            return r0
    }

    private java.lang.String permissionToString(int r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            boolean r1 = r3.hasPermission(r4, r1)
            r2 = 45
            if (r1 == 0) goto L14
            r1 = 114(0x72, float:1.6E-43)
            r0.append(r1)
            goto L17
        L14:
            r0.append(r2)
        L17:
            r1 = 1
            boolean r1 = r3.hasPermission(r4, r1)
            if (r1 == 0) goto L24
            r1 = 119(0x77, float:1.67E-43)
            r0.append(r1)
            goto L27
        L24:
            r0.append(r2)
        L27:
            r1 = 2
            boolean r4 = r3.hasPermission(r4, r1)
            if (r4 == 0) goto L34
            r4 = 120(0x78, float:1.68E-43)
            r0.append(r4)
            goto L37
        L34:
            r0.append(r2)
        L37:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public java.lang.String getGroup() {
            r1 = this;
            java.lang.String r0 = r1._group
            return r0
    }

    public int getHardLinkCount() {
            r1 = this;
            int r0 = r1._hardLinkCount
            return r0
    }

    public java.lang.String getLink() {
            r1 = this;
            java.lang.String r0 = r1._link
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1._name
            return r0
    }

    public java.lang.String getRawListing() {
            r1 = this;
            java.lang.String r0 = r1._rawListing
            return r0
    }

    public long getSize() {
            r2 = this;
            long r0 = r2._size
            return r0
    }

    public java.util.Calendar getTimestamp() {
            r1 = this;
            java.util.Calendar r0 = r1._date
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1._type
            return r0
    }

    public java.lang.String getUser() {
            r1 = this;
            java.lang.String r0 = r1._user
            return r0
    }

    public boolean hasPermission(int r2, int r3) {
            r1 = this;
            boolean[][] r0 = r1._permissions
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            r2 = r0[r2]
            boolean r2 = r2[r3]
            return r2
    }

    public boolean isDirectory() {
            r2 = this;
            int r0 = r2._type
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public boolean isFile() {
            r1 = this;
            int r0 = r1._type
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean isSymbolicLink() {
            r2 = this;
            int r0 = r2._type
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public boolean isUnknown() {
            r2 = this;
            int r0 = r2._type
            r1 = 3
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public boolean isValid() {
            r1 = this;
            boolean[][] r0 = r1._permissions
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void setGroup(java.lang.String r1) {
            r0 = this;
            r0._group = r1
            return
    }

    public void setHardLinkCount(int r1) {
            r0 = this;
            r0._hardLinkCount = r1
            return
    }

    public void setLink(java.lang.String r1) {
            r0 = this;
            r0._link = r1
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0._name = r1
            return
    }

    public void setPermission(int r2, int r3, boolean r4) {
            r1 = this;
            boolean[][] r0 = r1._permissions
            r2 = r0[r2]
            r2[r3] = r4
            return
    }

    public void setRawListing(java.lang.String r1) {
            r0 = this;
            r0._rawListing = r1
            return
    }

    public void setSize(long r1) {
            r0 = this;
            r0._size = r1
            return
    }

    public void setTimestamp(java.util.Calendar r1) {
            r0 = this;
            r0._date = r1
            return
    }

    public void setType(int r1) {
            r0 = this;
            r0._type = r1
            return
    }

    public void setUser(java.lang.String r1) {
            r0 = this;
            r0._user = r1
            return
    }

    public java.lang.String toFormattedString() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.toFormattedString(r0)
            return r0
    }

    public java.lang.String toFormattedString(java.lang.String r8) {
            r7 = this;
            boolean r0 = r7.isValid()
            if (r0 != 0) goto L9
            java.lang.String r8 = "[Invalid: could not parse file entry]"
            return r8
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Formatter r1 = new java.util.Formatter
            r1.<init>(r0)
            char r2 = r7.formatType()
            r0.append(r2)
            r2 = 0
            java.lang.String r3 = r7.permissionToString(r2)
            r0.append(r3)
            r3 = 1
            java.lang.String r4 = r7.permissionToString(r3)
            r0.append(r4)
            r4 = 2
            java.lang.String r5 = r7.permissionToString(r4)
            r0.append(r5)
            int r5 = r7.getHardLinkCount()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r5
            java.lang.String r5 = " %4d"
            r1.format(r5, r6)
            java.lang.String r5 = r7.getUser()
            java.lang.String r6 = r7.getGroup()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r5
            r4[r3] = r6
            java.lang.String r5 = " %-8s %-8s"
            r1.format(r5, r4)
            long r4 = r7.getSize()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r4
            java.lang.String r4 = " %8d"
            r1.format(r4, r5)
            java.util.Calendar r4 = r7.getTimestamp()
            if (r4 == 0) goto Ldf
            if (r8 == 0) goto L89
            java.util.TimeZone r8 = java.util.TimeZone.getTimeZone(r8)
            java.util.TimeZone r5 = r4.getTimeZone()
            boolean r5 = r8.equals(r5)
            if (r5 != 0) goto L89
            java.util.Date r4 = r4.getTime()
            java.util.Calendar r8 = java.util.Calendar.getInstance(r8)
            r8.setTime(r4)
            r4 = r8
        L89:
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r2] = r4
            java.lang.String r5 = " %1$tY-%1$tm-%1$td"
            r1.format(r5, r8)
            r8 = 11
            boolean r8 = r4.isSet(r8)
            if (r8 == 0) goto Ldf
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r2] = r4
            java.lang.String r5 = " %1$tH"
            r1.format(r5, r8)
            r8 = 12
            boolean r8 = r4.isSet(r8)
            if (r8 == 0) goto Ld6
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r2] = r4
            java.lang.String r5 = ":%1$tM"
            r1.format(r5, r8)
            r8 = 13
            boolean r8 = r4.isSet(r8)
            if (r8 == 0) goto Ld6
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r2] = r4
            java.lang.String r5 = ":%1$tS"
            r1.format(r5, r8)
            r8 = 14
            boolean r8 = r4.isSet(r8)
            if (r8 == 0) goto Ld6
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r2] = r4
            java.lang.String r5 = ".%1$tL"
            r1.format(r5, r8)
        Ld6:
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r2] = r4
            java.lang.String r2 = " %1$tZ"
            r1.format(r2, r8)
        Ldf:
            r8 = 32
            r0.append(r8)
            java.lang.String r8 = r7.getName()
            r0.append(r8)
            r1.close()
            java.lang.String r8 = r0.toString()
            return r8
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.getRawListing()
            return r0
    }
}
