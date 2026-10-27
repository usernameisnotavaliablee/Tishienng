package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ExifData {
    private static final boolean DEBUG = false;
    static final androidx.camera.core.impl.utils.ExifTag[] EXIF_POINTER_TAGS = null;
    static final androidx.camera.core.impl.utils.ExifTag[][] EXIF_TAGS = null;
    private static final androidx.camera.core.impl.utils.ExifTag[] IFD_EXIF_TAGS = null;
    static final java.lang.String[] IFD_FORMAT_NAMES = null;
    private static final androidx.camera.core.impl.utils.ExifTag[] IFD_GPS_TAGS = null;
    private static final androidx.camera.core.impl.utils.ExifTag[] IFD_INTEROPERABILITY_TAGS = null;
    private static final androidx.camera.core.impl.utils.ExifTag[] IFD_TIFF_TAGS = null;
    static final int IFD_TYPE_EXIF = 1;
    static final int IFD_TYPE_GPS = 2;
    static final int IFD_TYPE_INTEROPERABILITY = 3;
    static final int IFD_TYPE_PRIMARY = 0;
    private static final int MM_IN_MICRONS = 1000;
    private static final java.lang.String TAG = "ExifData";
    static final java.lang.String TAG_EXIF_IFD_POINTER = "ExifIFDPointer";
    static final java.lang.String TAG_GPS_INFO_IFD_POINTER = "GPSInfoIFDPointer";
    static final java.lang.String TAG_INTEROPERABILITY_IFD_POINTER = "InteroperabilityIFDPointer";
    static final java.lang.String TAG_SUB_IFD_POINTER = "SubIFDPointer";
    static final java.util.HashSet<java.lang.String> sTagSetForCompatibility = null;
    private final java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> mAttributes;
    private final java.nio.ByteOrder mByteOrder;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.core.impl.utils.ExifData$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState = null;
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$utils$ExifData$WhiteBalanceMode = null;

        static {
                androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode[] r0 = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.camera.core.impl.utils.ExifData.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$utils$ExifData$WhiteBalanceMode = r0
                r1 = 1
                androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode r2 = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.AUTO     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = androidx.camera.core.impl.utils.ExifData.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$utils$ExifData$WhiteBalanceMode     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode r3 = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.MANUAL     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState[] r2 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                androidx.camera.core.impl.utils.ExifData.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState = r2
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState r3 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.READY     // Catch: java.lang.NoSuchFieldError -> L2e
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2e
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L2e
            L2e:
                int[] r1 = androidx.camera.core.impl.utils.ExifData.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState     // Catch: java.lang.NoSuchFieldError -> L38
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState r2 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.NONE     // Catch: java.lang.NoSuchFieldError -> L38
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L38
            L38:
                int[] r0 = androidx.camera.core.impl.utils.ExifData.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState     // Catch: java.lang.NoSuchFieldError -> L43
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState r1 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.FIRED     // Catch: java.lang.NoSuchFieldError -> L43
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private static final java.util.regex.Pattern DATETIME_PRIMARY_FORMAT_PATTERN = null;
        private static final java.util.regex.Pattern DATETIME_SECONDARY_FORMAT_PATTERN = null;
        private static final int DATETIME_VALUE_STRING_LENGTH = 19;
        private static final java.util.regex.Pattern GPS_TIMESTAMP_PATTERN = null;
        static final java.util.List<java.util.HashMap<java.lang.String, androidx.camera.core.impl.utils.ExifTag>> sExifTagMapsForWriting = null;
        final java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> mAttributes;
        private final java.nio.ByteOrder mByteOrder;




        static {
                java.lang.String r0 = "^(\\d{2}):(\\d{2}):(\\d{2})$"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                androidx.camera.core.impl.utils.ExifData.Builder.GPS_TIMESTAMP_PATTERN = r0
                java.lang.String r0 = "^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                androidx.camera.core.impl.utils.ExifData.Builder.DATETIME_PRIMARY_FORMAT_PATTERN = r0
                java.lang.String r0 = "^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                androidx.camera.core.impl.utils.ExifData.Builder.DATETIME_SECONDARY_FORMAT_PATTERN = r0
                androidx.camera.core.impl.utils.ExifData$Builder$1 r0 = new androidx.camera.core.impl.utils.ExifData$Builder$1
                r0.<init>()
                java.util.ArrayList r0 = java.util.Collections.list(r0)
                androidx.camera.core.impl.utils.ExifData.Builder.sExifTagMapsForWriting = r0
                return
        }

        Builder(@androidx.annotation.NonNull java.nio.ByteOrder r2) {
                r1 = this;
                r1.<init>()
                androidx.camera.core.impl.utils.ExifData$Builder$2 r0 = new androidx.camera.core.impl.utils.ExifData$Builder$2
                r0.<init>(r1)
                java.util.ArrayList r0 = java.util.Collections.list(r0)
                r1.mAttributes = r0
                r1.mByteOrder = r2
                return
        }

        private static android.util.Pair<java.lang.Integer, java.lang.Integer> guessDataFormat(java.lang.String r13) {
                r0 = 4
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1 = 5
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 10
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 2
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                r5 = -1
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                java.lang.String r7 = ","
                boolean r8 = r13.contains(r7)
                r9 = 0
                r10 = 1
                if (r8 == 0) goto Lb6
                java.lang.String[] r13 = r13.split(r7, r5)
                r0 = r13[r9]
                android.util.Pair r0 = guessDataFormat(r0)
                java.lang.Object r1 = r0.first
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                if (r1 != r3) goto L39
                return r0
            L39:
                int r1 = r13.length
                if (r10 >= r1) goto Lb5
                r1 = r13[r10]
                android.util.Pair r1 = guessDataFormat(r1)
                java.lang.Object r2 = r1.first
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.lang.Object r3 = r0.first
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L5d
                java.lang.Object r2 = r1.second
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.lang.Object r3 = r0.first
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L5b
                goto L5d
            L5b:
                r2 = -1
                goto L65
            L5d:
                java.lang.Object r2 = r0.first
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
            L65:
                java.lang.Object r3 = r0.second
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r3 == r5) goto L90
                java.lang.Object r3 = r1.first
                java.lang.Integer r3 = (java.lang.Integer) r3
                java.lang.Object r7 = r0.second
                boolean r3 = r3.equals(r7)
                if (r3 != 0) goto L87
                java.lang.Object r1 = r1.second
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.lang.Object r3 = r0.second
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L90
            L87:
                java.lang.Object r1 = r0.second
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                goto L91
            L90:
                r1 = -1
            L91:
                if (r2 != r5) goto L9b
                if (r1 != r5) goto L9b
                android.util.Pair r13 = new android.util.Pair
                r13.<init>(r4, r6)
                return r13
            L9b:
                if (r2 != r5) goto La7
                android.util.Pair r0 = new android.util.Pair
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.<init>(r1, r6)
                goto Lb2
            La7:
                if (r1 != r5) goto Lb2
                android.util.Pair r0 = new android.util.Pair
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0.<init>(r1, r6)
            Lb2:
                int r10 = r10 + 1
                goto L39
            Lb5:
                return r0
            Lb6:
                java.lang.String r7 = "/"
                boolean r8 = r13.contains(r7)
                r11 = 0
                if (r8 == 0) goto L102
                java.lang.String[] r13 = r13.split(r7, r5)
                int r0 = r13.length
                if (r0 != r3) goto Lfc
                r0 = r13[r9]     // Catch: java.lang.NumberFormatException -> Lfc
                double r7 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> Lfc
                long r7 = (long) r7     // Catch: java.lang.NumberFormatException -> Lfc
                r13 = r13[r10]     // Catch: java.lang.NumberFormatException -> Lfc
                double r9 = java.lang.Double.parseDouble(r13)     // Catch: java.lang.NumberFormatException -> Lfc
                long r9 = (long) r9     // Catch: java.lang.NumberFormatException -> Lfc
                int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r13 < 0) goto Lf6
                int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r13 >= 0) goto Lde
                goto Lf6
            Lde:
                r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r13 > 0) goto Lf0
                int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r13 <= 0) goto Lea
                goto Lf0
            Lea:
                android.util.Pair r13 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> Lfc
                r13.<init>(r2, r1)     // Catch: java.lang.NumberFormatException -> Lfc
                return r13
            Lf0:
                android.util.Pair r13 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> Lfc
                r13.<init>(r1, r6)     // Catch: java.lang.NumberFormatException -> Lfc
                return r13
            Lf6:
                android.util.Pair r13 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> Lfc
                r13.<init>(r2, r6)     // Catch: java.lang.NumberFormatException -> Lfc
                return r13
            Lfc:
                android.util.Pair r13 = new android.util.Pair
                r13.<init>(r4, r6)
                return r13
            L102:
                long r1 = java.lang.Long.parseLong(r13)     // Catch: java.lang.NumberFormatException -> L130
                int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
                if (r3 < 0) goto L11c
                r7 = 65535(0xffff, double:3.23786E-319)
                int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                if (r5 > 0) goto L11c
                android.util.Pair r1 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> L130
                r2 = 3
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L130
                r1.<init>(r2, r0)     // Catch: java.lang.NumberFormatException -> L130
                return r1
            L11c:
                if (r3 >= 0) goto L12a
                android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> L130
                r1 = 9
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L130
                r0.<init>(r1, r6)     // Catch: java.lang.NumberFormatException -> L130
                return r0
            L12a:
                android.util.Pair r1 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> L130
                r1.<init>(r0, r6)     // Catch: java.lang.NumberFormatException -> L130
                return r1
            L130:
                java.lang.Double.parseDouble(r13)     // Catch: java.lang.NumberFormatException -> L13f
                android.util.Pair r13 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> L13f
                r0 = 12
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L13f
                r13.<init>(r0, r6)     // Catch: java.lang.NumberFormatException -> L13f
                return r13
            L13f:
                android.util.Pair r13 = new android.util.Pair
                r13.<init>(r4, r6)
                return r13
        }

        private void setAttributeIfMissing(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> r5) {
                r2 = this;
                java.util.Iterator r0 = r5.iterator()
            L4:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L17
                java.lang.Object r1 = r0.next()
                java.util.Map r1 = (java.util.Map) r1
                boolean r1 = r1.containsKey(r3)
                if (r1 == 0) goto L4
                return
            L17:
                r2.setAttributeInternal(r3, r4, r5)
                return
        }

        private void setAttributeInternal(@androidx.annotation.NonNull java.lang.String r17, @androidx.annotation.Nullable java.lang.String r18, @androidx.annotation.NonNull java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> r19) {
                r16 = this;
                r1 = r16
                r0 = r17
                r2 = r18
                r3 = r19
                java.lang.String r4 = "DateTime"
                boolean r4 = r4.equals(r0)
                java.lang.String r5 = " : "
                java.lang.String r6 = "Invalid value for "
                java.lang.String r7 = "ExifData"
                if (r4 != 0) goto L26
                java.lang.String r4 = "DateTimeOriginal"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L26
                java.lang.String r4 = "DateTimeDigitized"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L6d
            L26:
                if (r2 == 0) goto L6d
                java.util.regex.Pattern r4 = androidx.camera.core.impl.utils.ExifData.Builder.DATETIME_PRIMARY_FORMAT_PATTERN
                java.util.regex.Matcher r4 = r4.matcher(r2)
                boolean r4 = r4.find()
                java.util.regex.Pattern r8 = androidx.camera.core.impl.utils.ExifData.Builder.DATETIME_SECONDARY_FORMAT_PATTERN
                java.util.regex.Matcher r8 = r8.matcher(r2)
                boolean r8 = r8.find()
                int r9 = r2.length()
                r10 = 19
                if (r9 != r10) goto L54
                if (r4 != 0) goto L49
                if (r8 != 0) goto L49
                goto L54
            L49:
                if (r8 == 0) goto L6d
                java.lang.String r4 = "-"
                java.lang.String r8 = ":"
                java.lang.String r2 = r2.replaceAll(r4, r8)
                goto L6d
            L54:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r6)
                r3.append(r0)
                r3.append(r5)
                r3.append(r2)
                java.lang.String r0 = r3.toString()
                androidx.camera.core.Logger.w(r7, r0)
                return
            L6d:
                java.lang.String r4 = "ISOSpeedRatings"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L77
                java.lang.String r0 = "PhotographicSensitivity"
            L77:
                r4 = r0
                r0 = 2
                r8 = 1
                if (r2 == 0) goto L124
                java.util.HashSet<java.lang.String> r9 = androidx.camera.core.impl.utils.ExifData.sTagSetForCompatibility
                boolean r9 = r9.contains(r4)
                if (r9 == 0) goto L124
                java.lang.String r9 = "GPSTimeStamp"
                boolean r9 = r4.equals(r9)
                if (r9 == 0) goto Lfc
                java.util.regex.Pattern r9 = androidx.camera.core.impl.utils.ExifData.Builder.GPS_TIMESTAMP_PATTERN
                java.util.regex.Matcher r9 = r9.matcher(r2)
                boolean r10 = r9.find()
                if (r10 != 0) goto Lb1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r6)
                r0.append(r4)
                r0.append(r5)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                androidx.camera.core.Logger.w(r7, r0)
                return
            Lb1:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = r9.group(r8)
                java.lang.Object r5 = androidx.core.util.Preconditions.checkNotNull(r5)
                java.lang.String r5 = (java.lang.String) r5
                int r5 = java.lang.Integer.parseInt(r5)
                r2.append(r5)
                java.lang.String r5 = "/1,"
                r2.append(r5)
                java.lang.String r6 = r9.group(r0)
                java.lang.Object r6 = androidx.core.util.Preconditions.checkNotNull(r6)
                java.lang.String r6 = (java.lang.String) r6
                int r6 = java.lang.Integer.parseInt(r6)
                r2.append(r6)
                r2.append(r5)
                r5 = 3
                java.lang.String r5 = r9.group(r5)
                java.lang.Object r5 = androidx.core.util.Preconditions.checkNotNull(r5)
                java.lang.String r5 = (java.lang.String) r5
                int r5 = java.lang.Integer.parseInt(r5)
                r2.append(r5)
                java.lang.String r5 = "/1"
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                goto L124
            Lfc:
                double r9 = java.lang.Double.parseDouble(r2)     // Catch: java.lang.NumberFormatException -> L10a
                androidx.camera.core.impl.utils.LongRational r11 = new androidx.camera.core.impl.utils.LongRational     // Catch: java.lang.NumberFormatException -> L10a
                r11.<init>(r9)     // Catch: java.lang.NumberFormatException -> L10a
                java.lang.String r2 = r11.toString()     // Catch: java.lang.NumberFormatException -> L10a
                goto L124
            L10a:
                r0 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r6)
                r3.append(r4)
                r3.append(r5)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                androidx.camera.core.Logger.w(r7, r2, r0)
                return
            L124:
                r5 = 0
                r6 = 0
            L126:
                androidx.camera.core.impl.utils.ExifTag[][] r7 = androidx.camera.core.impl.utils.ExifData.EXIF_TAGS
                int r7 = r7.length
                if (r6 >= r7) goto L2eb
                java.util.List<java.util.HashMap<java.lang.String, androidx.camera.core.impl.utils.ExifTag>> r7 = androidx.camera.core.impl.utils.ExifData.Builder.sExifTagMapsForWriting
                java.lang.Object r7 = r7.get(r6)
                java.util.HashMap r7 = (java.util.HashMap) r7
                java.lang.Object r7 = r7.get(r4)
                androidx.camera.core.impl.utils.ExifTag r7 = (androidx.camera.core.impl.utils.ExifTag) r7
                if (r7 == 0) goto L146
                if (r2 != 0) goto L14a
                java.lang.Object r7 = r3.get(r6)
                java.util.Map r7 = (java.util.Map) r7
                r7.remove(r4)
            L146:
                r17 = 1
                goto L2e5
            L14a:
                android.util.Pair r9 = guessDataFormat(r2)
                int r10 = r7.primaryFormat
                java.lang.Object r11 = r9.first
                java.lang.Integer r11 = (java.lang.Integer) r11
                int r11 = r11.intValue()
                r12 = -1
                if (r10 == r11) goto L18f
                int r10 = r7.primaryFormat
                java.lang.Object r11 = r9.second
                java.lang.Integer r11 = (java.lang.Integer) r11
                int r11 = r11.intValue()
                if (r10 != r11) goto L168
                goto L18f
            L168:
                int r10 = r7.secondaryFormat
                if (r10 == r12) goto L185
                java.lang.Object r11 = r9.first
                java.lang.Integer r11 = (java.lang.Integer) r11
                int r11 = r11.intValue()
                if (r10 == r11) goto L182
                int r10 = r7.secondaryFormat
                java.lang.Object r9 = r9.second
                java.lang.Integer r9 = (java.lang.Integer) r9
                int r9 = r9.intValue()
                if (r10 != r9) goto L185
            L182:
                int r7 = r7.secondaryFormat
                goto L191
            L185:
                int r7 = r7.primaryFormat
                if (r7 == r8) goto L191
                r9 = 7
                if (r7 == r9) goto L191
                if (r7 != r0) goto L146
                goto L191
            L18f:
                int r7 = r7.primaryFormat
            L191:
                java.lang.String r9 = "/"
                java.lang.String r10 = ","
                switch(r7) {
                    case 1: goto L2d6;
                    case 2: goto L2c6;
                    case 3: goto L29d;
                    case 4: goto L274;
                    case 5: goto L22d;
                    case 6: goto L198;
                    case 7: goto L2c6;
                    case 8: goto L198;
                    case 9: goto L203;
                    case 10: goto L1bf;
                    case 11: goto L198;
                    case 12: goto L199;
                    default: goto L198;
                }
            L198:
                goto L146
            L199:
                java.lang.String[] r7 = r2.split(r10, r12)
                int r9 = r7.length
                double[] r9 = new double[r9]
                r10 = 0
            L1a1:
                int r11 = r7.length
                if (r10 >= r11) goto L1af
                r11 = r7[r10]
                double r11 = java.lang.Double.parseDouble(r11)
                r9[r10] = r11
                int r10 = r10 + 1
                goto L1a1
            L1af:
                java.lang.Object r7 = r3.get(r6)
                java.util.Map r7 = (java.util.Map) r7
                java.nio.ByteOrder r10 = r1.mByteOrder
                androidx.camera.core.impl.utils.ExifAttribute r9 = androidx.camera.core.impl.utils.ExifAttribute.createDouble(r9, r10)
                r7.put(r4, r9)
                goto L146
            L1bf:
                java.lang.String[] r7 = r2.split(r10, r12)
                int r10 = r7.length
                androidx.camera.core.impl.utils.LongRational[] r10 = new androidx.camera.core.impl.utils.LongRational[r10]
                r11 = 0
            L1c7:
                int r13 = r7.length
                if (r11 >= r13) goto L1f0
                r13 = r7[r11]
                java.lang.String[] r13 = r13.split(r9, r12)
                androidx.camera.core.impl.utils.LongRational r14 = new androidx.camera.core.impl.utils.LongRational
                r15 = r13[r5]
                r18 = r9
                r17 = 1
                double r8 = java.lang.Double.parseDouble(r15)
                long r8 = (long) r8
                r13 = r13[r17]
                double r12 = java.lang.Double.parseDouble(r13)
                long r12 = (long) r12
                r14.<init>(r8, r12)
                r10[r11] = r14
                int r11 = r11 + 1
                r9 = r18
                r8 = 1
                r12 = -1
                goto L1c7
            L1f0:
                r17 = 1
                java.lang.Object r7 = r3.get(r6)
                java.util.Map r7 = (java.util.Map) r7
                java.nio.ByteOrder r8 = r1.mByteOrder
                androidx.camera.core.impl.utils.ExifAttribute r8 = androidx.camera.core.impl.utils.ExifAttribute.createSRational(r10, r8)
                r7.put(r4, r8)
                goto L2e5
            L203:
                r17 = 1
                r15 = -1
                java.lang.String[] r7 = r2.split(r10, r15)
                int r8 = r7.length
                int[] r8 = new int[r8]
                r9 = 0
            L20e:
                int r10 = r7.length
                if (r9 >= r10) goto L21c
                r10 = r7[r9]
                int r10 = java.lang.Integer.parseInt(r10)
                r8[r9] = r10
                int r9 = r9 + 1
                goto L20e
            L21c:
                java.lang.Object r7 = r3.get(r6)
                java.util.Map r7 = (java.util.Map) r7
                java.nio.ByteOrder r9 = r1.mByteOrder
                androidx.camera.core.impl.utils.ExifAttribute r8 = androidx.camera.core.impl.utils.ExifAttribute.createSLong(r8, r9)
                r7.put(r4, r8)
                goto L2e5
            L22d:
                r18 = r9
                r17 = 1
                r15 = -1
                java.lang.String[] r7 = r2.split(r10, r15)
                int r8 = r7.length
                androidx.camera.core.impl.utils.LongRational[] r8 = new androidx.camera.core.impl.utils.LongRational[r8]
                r9 = 0
            L23a:
                int r10 = r7.length
                if (r9 >= r10) goto L261
                r10 = r7[r9]
                r11 = r18
                java.lang.String[] r10 = r10.split(r11, r15)
                androidx.camera.core.impl.utils.LongRational r12 = new androidx.camera.core.impl.utils.LongRational
                r13 = r10[r5]
                double r13 = java.lang.Double.parseDouble(r13)
                long r13 = (long) r13
                r10 = r10[r17]
                double r0 = java.lang.Double.parseDouble(r10)
                long r0 = (long) r0
                r12.<init>(r13, r0)
                r8[r9] = r12
                int r9 = r9 + 1
                r0 = 2
                r15 = -1
                r1 = r16
                goto L23a
            L261:
                java.lang.Object r0 = r3.get(r6)
                java.util.Map r0 = (java.util.Map) r0
                r1 = r16
                java.nio.ByteOrder r7 = r1.mByteOrder
                androidx.camera.core.impl.utils.ExifAttribute r7 = androidx.camera.core.impl.utils.ExifAttribute.createURational(r8, r7)
                r0.put(r4, r7)
                goto L2e5
            L274:
                r17 = 1
                r15 = -1
                java.lang.String[] r0 = r2.split(r10, r15)
                int r7 = r0.length
                long[] r7 = new long[r7]
                r8 = 0
            L27f:
                int r9 = r0.length
                if (r8 >= r9) goto L28d
                r9 = r0[r8]
                long r9 = java.lang.Long.parseLong(r9)
                r7[r8] = r9
                int r8 = r8 + 1
                goto L27f
            L28d:
                java.lang.Object r0 = r3.get(r6)
                java.util.Map r0 = (java.util.Map) r0
                java.nio.ByteOrder r8 = r1.mByteOrder
                androidx.camera.core.impl.utils.ExifAttribute r7 = androidx.camera.core.impl.utils.ExifAttribute.createULong(r7, r8)
                r0.put(r4, r7)
                goto L2e5
            L29d:
                r17 = 1
                r15 = -1
                java.lang.String[] r0 = r2.split(r10, r15)
                int r7 = r0.length
                int[] r7 = new int[r7]
                r8 = 0
            L2a8:
                int r9 = r0.length
                if (r8 >= r9) goto L2b6
                r9 = r0[r8]
                int r9 = java.lang.Integer.parseInt(r9)
                r7[r8] = r9
                int r8 = r8 + 1
                goto L2a8
            L2b6:
                java.lang.Object r0 = r3.get(r6)
                java.util.Map r0 = (java.util.Map) r0
                java.nio.ByteOrder r8 = r1.mByteOrder
                androidx.camera.core.impl.utils.ExifAttribute r7 = androidx.camera.core.impl.utils.ExifAttribute.createUShort(r7, r8)
                r0.put(r4, r7)
                goto L2e5
            L2c6:
                r17 = 1
                java.lang.Object r0 = r3.get(r6)
                java.util.Map r0 = (java.util.Map) r0
                androidx.camera.core.impl.utils.ExifAttribute r7 = androidx.camera.core.impl.utils.ExifAttribute.createString(r2)
                r0.put(r4, r7)
                goto L2e5
            L2d6:
                r17 = 1
                java.lang.Object r0 = r3.get(r6)
                java.util.Map r0 = (java.util.Map) r0
                androidx.camera.core.impl.utils.ExifAttribute r7 = androidx.camera.core.impl.utils.ExifAttribute.createByte(r2)
                r0.put(r4, r7)
            L2e5:
                int r6 = r6 + 1
                r0 = 2
                r8 = 1
                goto L126
            L2eb:
                return
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.utils.ExifData build() {
                r6 = this;
                androidx.camera.core.impl.utils.ExifData$Builder$3 r0 = new androidx.camera.core.impl.utils.ExifData$Builder$3
                r0.<init>(r6)
                java.util.ArrayList r0 = java.util.Collections.list(r0)
                r1 = 1
                java.lang.Object r2 = r0.get(r1)
                java.util.Map r2 = (java.util.Map) r2
                boolean r2 = r2.isEmpty()
                r3 = 2
                if (r2 != 0) goto L91
                java.lang.String r2 = "ExposureProgram"
                r4 = 0
                java.lang.String r5 = java.lang.String.valueOf(r4)
                r6.setAttributeIfMissing(r2, r5, r0)
                java.lang.String r2 = "ExifVersion"
                java.lang.String r5 = "0230"
                r6.setAttributeIfMissing(r2, r5, r0)
                java.lang.String r2 = "ComponentsConfiguration"
                java.lang.String r5 = "1,2,3,0"
                r6.setAttributeIfMissing(r2, r5, r0)
                java.lang.String r2 = "MeteringMode"
                java.lang.String r5 = java.lang.String.valueOf(r4)
                r6.setAttributeIfMissing(r2, r5, r0)
                java.lang.String r2 = "LightSource"
                java.lang.String r5 = java.lang.String.valueOf(r4)
                r6.setAttributeIfMissing(r2, r5, r0)
                java.lang.String r2 = "FlashpixVersion"
                java.lang.String r5 = "0100"
                r6.setAttributeIfMissing(r2, r5, r0)
                java.lang.String r2 = "FocalPlaneResolutionUnit"
                java.lang.String r5 = java.lang.String.valueOf(r3)
                r6.setAttributeIfMissing(r2, r5, r0)
                r2 = 3
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.lang.String r5 = "FileSource"
                r6.setAttributeIfMissing(r5, r2, r0)
                java.lang.String r2 = "SceneType"
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r6.setAttributeIfMissing(r2, r1, r0)
                java.lang.String r1 = "CustomRendered"
                java.lang.String r2 = java.lang.String.valueOf(r4)
                r6.setAttributeIfMissing(r1, r2, r0)
                java.lang.String r1 = "SceneCaptureType"
                java.lang.String r2 = java.lang.String.valueOf(r4)
                r6.setAttributeIfMissing(r1, r2, r0)
                java.lang.String r1 = "Contrast"
                java.lang.String r2 = java.lang.String.valueOf(r4)
                r6.setAttributeIfMissing(r1, r2, r0)
                java.lang.String r1 = "Saturation"
                java.lang.String r2 = java.lang.String.valueOf(r4)
                r6.setAttributeIfMissing(r1, r2, r0)
                java.lang.String r1 = "Sharpness"
                java.lang.String r2 = java.lang.String.valueOf(r4)
                r6.setAttributeIfMissing(r1, r2, r0)
            L91:
                java.lang.Object r1 = r0.get(r3)
                java.util.Map r1 = (java.util.Map) r1
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto Lc1
                java.lang.String r1 = "GPSVersionID"
                java.lang.String r2 = "2300"
                r6.setAttributeIfMissing(r1, r2, r0)
                java.lang.String r1 = "GPSSpeedRef"
                java.lang.String r2 = "K"
                r6.setAttributeIfMissing(r1, r2, r0)
                java.lang.String r1 = "GPSTrackRef"
                java.lang.String r3 = "T"
                r6.setAttributeIfMissing(r1, r3, r0)
                java.lang.String r1 = "GPSImgDirectionRef"
                r6.setAttributeIfMissing(r1, r3, r0)
                java.lang.String r1 = "GPSDestBearingRef"
                r6.setAttributeIfMissing(r1, r3, r0)
                java.lang.String r1 = "GPSDestDistanceRef"
                r6.setAttributeIfMissing(r1, r2, r0)
            Lc1:
                androidx.camera.core.impl.utils.ExifData r1 = new androidx.camera.core.impl.utils.ExifData
                java.nio.ByteOrder r2 = r6.mByteOrder
                r1.<init>(r2, r0)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.utils.ExifData.Builder removeAttribute(@androidx.annotation.NonNull java.lang.String r3) {
                r2 = this;
                r0 = 0
                java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> r1 = r2.mAttributes
                r2.setAttributeInternal(r3, r0, r1)
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.utils.ExifData.Builder setAttribute(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
                r1 = this;
                java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> r0 = r1.mAttributes
                r1.setAttributeInternal(r2, r3, r0)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.utils.ExifData.Builder setExposureTimeNanos(long r4) {
                r3 = this;
                double r4 = (double) r4
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
                r1 = 1
                long r0 = r0.toNanos(r1)
                double r0 = (double) r0
                double r4 = r4 / r0
                java.lang.String r4 = java.lang.String.valueOf(r4)
                java.lang.String r5 = "ExposureTime"
                androidx.camera.core.impl.utils.ExifData$Builder r4 = r3.setAttribute(r5, r4)
                return r4
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.utils.ExifData.Builder setFlashState(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureMetaData.FlashState r4) {
                r3 = this;
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState r0 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.UNKNOWN
                if (r4 != r0) goto L5
                return r3
            L5:
                int[] r0 = androidx.camera.core.impl.utils.ExifData.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState
                int r1 = r4.ordinal()
                r0 = r0[r1]
                r1 = 1
                if (r0 == r1) goto L32
                r2 = 2
                if (r0 == r2) goto L2f
                r2 = 3
                if (r0 == r2) goto L2d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unknown flash state: "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.String r0 = "ExifData"
                androidx.camera.core.Logger.w(r0, r4)
                return r3
            L2d:
                r4 = 1
                goto L33
            L2f:
                r4 = 32
                goto L33
            L32:
                r4 = 0
            L33:
                r0 = r4 & 1
                if (r0 != r1) goto L41
                r0 = 4
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.String r1 = "LightSource"
                r3.setAttribute(r1, r0)
            L41:
                java.lang.String r0 = "Flash"
                java.lang.String r4 = java.lang.String.valueOf(r4)
                androidx.camera.core.impl.utils.ExifData$Builder r4 = r3.setAttribute(r0, r4)
                return r4
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.utils.ExifData.Builder setFocalLength(float r6) {
                r5 = this;
                androidx.camera.core.impl.utils.LongRational r0 = new androidx.camera.core.impl.utils.LongRational
                r1 = 1148846080(0x447a0000, float:1000.0)
                float r6 = r6 * r1
                long r1 = (long) r6
                r3 = 1000(0x3e8, double:4.94E-321)
                r0.<init>(r1, r3)
                java.lang.String r6 = "FocalLength"
                java.lang.String r0 = r0.toString()
                androidx.camera.core.impl.utils.ExifData$Builder r6 = r5.setAttribute(r6, r0)
                return r6
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.utils.ExifData.Builder setImageHeight(int r2) {
                r1 = this;
                java.lang.String r0 = "ImageLength"
                java.lang.String r2 = java.lang.String.valueOf(r2)
                androidx.camera.core.impl.utils.ExifData$Builder r2 = r1.setAttribute(r0, r2)
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.utils.ExifData.Builder setImageWidth(int r2) {
                r1 = this;
                java.lang.String r0 = "ImageWidth"
                java.lang.String r2 = java.lang.String.valueOf(r2)
                androidx.camera.core.impl.utils.ExifData$Builder r2 = r1.setAttribute(r0, r2)
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.utils.ExifData.Builder setIso(int r3) {
                r2 = this;
                r0 = 3
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.String r1 = "SensitivityType"
                androidx.camera.core.impl.utils.ExifData$Builder r0 = r2.setAttribute(r1, r0)
                r1 = 65535(0xffff, float:9.1834E-41)
                int r3 = java.lang.Math.min(r1, r3)
                java.lang.String r3 = java.lang.String.valueOf(r3)
                java.lang.String r1 = "PhotographicSensitivity"
                androidx.camera.core.impl.utils.ExifData$Builder r3 = r0.setAttribute(r1, r3)
                return r3
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.utils.ExifData.Builder setLensFNumber(float r2) {
                r1 = this;
                java.lang.String r0 = "FNumber"
                java.lang.String r2 = java.lang.String.valueOf(r2)
                androidx.camera.core.impl.utils.ExifData$Builder r2 = r1.setAttribute(r0, r2)
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.utils.ExifData.Builder setOrientationDegrees(int r3) {
                r2 = this;
                if (r3 == 0) goto L32
                r0 = 90
                if (r3 == r0) goto L30
                r0 = 180(0xb4, float:2.52E-43)
                if (r3 == r0) goto L2e
                r0 = 270(0x10e, float:3.78E-43)
                if (r3 == r0) goto L2b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unexpected orientation value: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = ". Must be one of 0, 90, 180, 270."
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "ExifData"
                androidx.camera.core.Logger.w(r0, r3)
                r3 = 0
                goto L33
            L2b:
                r3 = 8
                goto L33
            L2e:
                r3 = 3
                goto L33
            L30:
                r3 = 6
                goto L33
            L32:
                r3 = 1
            L33:
                java.lang.String r0 = "Orientation"
                java.lang.String r3 = java.lang.String.valueOf(r3)
                androidx.camera.core.impl.utils.ExifData$Builder r3 = r2.setAttribute(r0, r3)
                return r3
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.utils.ExifData.Builder setWhiteBalanceMode(@androidx.annotation.NonNull androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode r3) {
                r2 = this;
                int[] r0 = androidx.camera.core.impl.utils.ExifData.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$utils$ExifData$WhiteBalanceMode
                int r3 = r3.ordinal()
                r3 = r0[r3]
                r0 = 1
                if (r3 == r0) goto L15
                r1 = 2
                if (r3 == r1) goto L10
                r3 = 0
                goto L1a
            L10:
                java.lang.String r3 = java.lang.String.valueOf(r0)
                goto L1a
            L15:
                r3 = 0
                java.lang.String r3 = java.lang.String.valueOf(r3)
            L1a:
                java.lang.String r0 = "WhiteBalance"
                androidx.camera.core.impl.utils.ExifData$Builder r3 = r2.setAttribute(r0, r3)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum WhiteBalanceMode extends java.lang.Enum<androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode> {
        private static final /* synthetic */ androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode[] $VALUES = null;
        public static final androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode AUTO = null;
        public static final androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode MANUAL = null;

        private static /* synthetic */ androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode[] $values() {
                r0 = 2
                androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode[] r0 = new androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode[r0]
                androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode r1 = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.AUTO
                r2 = 0
                r0[r2] = r1
                androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode r1 = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.MANUAL
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode r0 = new androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode
                java.lang.String r1 = "AUTO"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.AUTO = r0
                androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode r0 = new androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode
                java.lang.String r1 = "MANUAL"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.MANUAL = r0
                androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode[] r0 = $values()
                androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.$VALUES = r0
                return
        }

        WhiteBalanceMode(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode> r0 = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode r1 = (androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode) r1
                return r1
        }

        public static androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode[] values() {
                androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode[] r0 = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode[] r0 = (androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode[]) r0
                return r0
        }
    }

    static {
            java.lang.String r12 = "DOUBLE"
            java.lang.String r13 = "IFD"
            java.lang.String r0 = ""
            java.lang.String r1 = "BYTE"
            java.lang.String r2 = "STRING"
            java.lang.String r3 = "USHORT"
            java.lang.String r4 = "ULONG"
            java.lang.String r5 = "URATIONAL"
            java.lang.String r6 = "SBYTE"
            java.lang.String r7 = "UNDEFINED"
            java.lang.String r8 = "SSHORT"
            java.lang.String r9 = "SLONG"
            java.lang.String r10 = "SRATIONAL"
            java.lang.String r11 = "SINGLE"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            androidx.camera.core.impl.utils.ExifData.IFD_FORMAT_NAMES = r0
            androidx.camera.core.impl.utils.ExifTag r0 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r1 = "ImageWidth"
            r2 = 256(0x100, float:3.59E-43)
            r3 = 3
            r4 = 4
            r0.<init>(r1, r2, r3, r4)
            androidx.camera.core.impl.utils.ExifTag r1 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r2 = "ImageLength"
            r5 = 257(0x101, float:3.6E-43)
            r1.<init>(r2, r5, r3, r4)
            androidx.camera.core.impl.utils.ExifTag r2 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r5 = "Make"
            r6 = 271(0x10f, float:3.8E-43)
            r7 = 2
            r2.<init>(r5, r6, r7)
            androidx.camera.core.impl.utils.ExifTag r5 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r6 = "Model"
            r8 = 272(0x110, float:3.81E-43)
            r5.<init>(r6, r8, r7)
            androidx.camera.core.impl.utils.ExifTag r6 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r8 = "Orientation"
            r9 = 274(0x112, float:3.84E-43)
            r6.<init>(r8, r9, r3)
            androidx.camera.core.impl.utils.ExifTag r8 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r9 = "XResolution"
            r10 = 282(0x11a, float:3.95E-43)
            r11 = 5
            r8.<init>(r9, r10, r11)
            androidx.camera.core.impl.utils.ExifTag r9 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r10 = "YResolution"
            r12 = 283(0x11b, float:3.97E-43)
            r9.<init>(r10, r12, r11)
            androidx.camera.core.impl.utils.ExifTag r10 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r12 = "ResolutionUnit"
            r13 = 296(0x128, float:4.15E-43)
            r10.<init>(r12, r13, r3)
            androidx.camera.core.impl.utils.ExifTag r12 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r13 = "Software"
            r14 = 305(0x131, float:4.27E-43)
            r12.<init>(r13, r14, r7)
            androidx.camera.core.impl.utils.ExifTag r13 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r14 = "DateTime"
            r15 = 306(0x132, float:4.29E-43)
            r13.<init>(r14, r15, r7)
            androidx.camera.core.impl.utils.ExifTag r14 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r15 = "YCbCrPositioning"
            r16 = 2
            r7 = 531(0x213, float:7.44E-43)
            r14.<init>(r15, r7, r3)
            androidx.camera.core.impl.utils.ExifTag r7 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r15 = "SubIFDPointer"
            r17 = 3
            r3 = 330(0x14a, float:4.62E-43)
            r7.<init>(r15, r3, r4)
            androidx.camera.core.impl.utils.ExifTag r3 = new androidx.camera.core.impl.utils.ExifTag
            r18 = 5
            java.lang.String r11 = "ExifIFDPointer"
            r19 = r0
            r0 = 34665(0x8769, float:4.8576E-41)
            r3.<init>(r11, r0, r4)
            androidx.camera.core.impl.utils.ExifTag r0 = new androidx.camera.core.impl.utils.ExifTag
            r20 = r1
            java.lang.String r1 = "GPSInfoIFDPointer"
            r21 = r2
            r2 = 34853(0x8825, float:4.884E-41)
            r0.<init>(r1, r2, r4)
            r2 = 14
            r22 = 4
            androidx.camera.core.impl.utils.ExifTag[] r4 = new androidx.camera.core.impl.utils.ExifTag[r2]
            r23 = 14
            r2 = 0
            r4[r2] = r19
            r19 = 0
            r2 = 1
            r4[r2] = r20
            r4[r16] = r21
            r4[r17] = r5
            r4[r22] = r6
            r4[r18] = r8
            r5 = 6
            r4[r5] = r9
            r6 = 7
            r4[r6] = r10
            r8 = 8
            r4[r8] = r12
            r9 = 9
            r4[r9] = r13
            r10 = 10
            r4[r10] = r14
            r12 = 11
            r4[r12] = r7
            r7 = 12
            r4[r7] = r3
            r3 = 13
            r4[r3] = r0
            androidx.camera.core.impl.utils.ExifData.IFD_TIFF_TAGS = r4
            androidx.camera.core.impl.utils.ExifTag r0 = new androidx.camera.core.impl.utils.ExifTag
            r13 = 33434(0x829a, float:4.6851E-41)
            java.lang.String r14 = "ExposureTime"
            r8 = 5
            r20 = 8
            r0.<init>(r14, r13, r8)
            androidx.camera.core.impl.utils.ExifTag r13 = new androidx.camera.core.impl.utils.ExifTag
            r21 = 9
            r9 = 33437(0x829d, float:4.6855E-41)
            r24 = 11
            java.lang.String r12 = "FNumber"
            r13.<init>(r12, r9, r8)
            androidx.camera.core.impl.utils.ExifTag r8 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r9 = "ExposureProgram"
            r25 = 13
            r3 = 34850(0x8822, float:4.8835E-41)
            r7 = 3
            r26 = 12
            r8.<init>(r9, r3, r7)
            androidx.camera.core.impl.utils.ExifTag r3 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r9 = "PhotographicSensitivity"
            r27 = 6
            r5 = 34855(0x8827, float:4.8842E-41)
            r3.<init>(r9, r5, r7)
            androidx.camera.core.impl.utils.ExifTag r5 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r9 = "SensitivityType"
            r28 = 1
            r2 = 34864(0x8830, float:4.8855E-41)
            r5.<init>(r9, r2, r7)
            androidx.camera.core.impl.utils.ExifTag r2 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r7 = "ExifVersion"
            r9 = 36864(0x9000, float:5.1657E-41)
            r10 = 2
            r2.<init>(r7, r9, r10)
            androidx.camera.core.impl.utils.ExifTag r7 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r9 = "DateTimeOriginal"
            r6 = 36867(0x9003, float:5.1662E-41)
            r7.<init>(r9, r6, r10)
            androidx.camera.core.impl.utils.ExifTag r6 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r9 = "DateTimeDigitized"
            r31 = r0
            r0 = 36868(0x9004, float:5.1663E-41)
            r6.<init>(r9, r0, r10)
            androidx.camera.core.impl.utils.ExifTag r0 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r9 = "ComponentsConfiguration"
            r10 = 37121(0x9101, float:5.2018E-41)
            r32 = r2
            r2 = 7
            r0.<init>(r9, r10, r2)
            androidx.camera.core.impl.utils.ExifTag r2 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r9 = "ShutterSpeedValue"
            r10 = 37377(0x9201, float:5.2376E-41)
            r33 = r0
            r0 = 10
            r2.<init>(r9, r10, r0)
            androidx.camera.core.impl.utils.ExifTag r9 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r10 = "ApertureValue"
            r0 = 37378(0x9202, float:5.2378E-41)
            r34 = r2
            r2 = 5
            r9.<init>(r10, r0, r2)
            androidx.camera.core.impl.utils.ExifTag r0 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r2 = "BrightnessValue"
            r10 = 37379(0x9203, float:5.2379E-41)
            r35 = r3
            r3 = 10
            r0.<init>(r2, r10, r3)
            androidx.camera.core.impl.utils.ExifTag r2 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r10 = "ExposureBiasValue"
            r36 = r0
            r0 = 37380(0x9204, float:5.238E-41)
            r2.<init>(r10, r0, r3)
            androidx.camera.core.impl.utils.ExifTag r0 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r3 = "MaxApertureValue"
            r10 = 37381(0x9205, float:5.2382E-41)
            r37 = r2
            r2 = 5
            r0.<init>(r3, r10, r2)
            androidx.camera.core.impl.utils.ExifTag r2 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r3 = "MeteringMode"
            r10 = 37383(0x9207, float:5.2385E-41)
            r38 = r0
            r0 = 3
            r2.<init>(r3, r10, r0)
            androidx.camera.core.impl.utils.ExifTag r3 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r10 = "LightSource"
            r39 = r2
            r2 = 37384(0x9208, float:5.2386E-41)
            r3.<init>(r10, r2, r0)
            androidx.camera.core.impl.utils.ExifTag r2 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r10 = "Flash"
            r40 = r3
            r3 = 37385(0x9209, float:5.2388E-41)
            r2.<init>(r10, r3, r0)
            androidx.camera.core.impl.utils.ExifTag r0 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r3 = "FocalLength"
            r10 = 37386(0x920a, float:5.2389E-41)
            r41 = r2
            r2 = 5
            r0.<init>(r3, r10, r2)
            androidx.camera.core.impl.utils.ExifTag r2 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r3 = "SubSecTime"
            r10 = 37520(0x9290, float:5.2577E-41)
            r42 = r0
            r0 = 2
            r2.<init>(r3, r10, r0)
            androidx.camera.core.impl.utils.ExifTag r3 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r10 = "SubSecTimeOriginal"
            r43 = r2
            r2 = 37521(0x9291, float:5.2578E-41)
            r3.<init>(r10, r2, r0)
            androidx.camera.core.impl.utils.ExifTag r2 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r10 = "SubSecTimeDigitized"
            r44 = r3
            r3 = 37522(0x9292, float:5.258E-41)
            r2.<init>(r10, r3, r0)
            androidx.camera.core.impl.utils.ExifTag r0 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r3 = "FlashpixVersion"
            r10 = 40960(0xa000, float:5.7397E-41)
            r45 = r2
            r2 = 7
            r0.<init>(r3, r10, r2)
            androidx.camera.core.impl.utils.ExifTag r2 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r3 = "ColorSpace"
            r10 = 40961(0xa001, float:5.7399E-41)
            r46 = r0
            r0 = 3
            r2.<init>(r3, r10, r0)
            androidx.camera.core.impl.utils.ExifTag r3 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r10 = "PixelXDimension"
            r47 = r2
            r2 = 40962(0xa002, float:5.74E-41)
            r48 = r4
            r4 = 4
            r3.<init>(r10, r2, r0, r4)
            androidx.camera.core.impl.utils.ExifTag r2 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r10 = "PixelYDimension"
            r49 = r3
            r3 = 40963(0xa003, float:5.7401E-41)
            r2.<init>(r10, r3, r0, r4)
            androidx.camera.core.impl.utils.ExifTag r3 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r10 = "InteroperabilityIFDPointer"
            r0 = 40965(0xa005, float:5.7404E-41)
            r3.<init>(r10, r0, r4)
            androidx.camera.core.impl.utils.ExifTag r4 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r0 = "FocalPlaneResolutionUnit"
            r50 = r2
            r2 = 41488(0xa210, float:5.8137E-41)
            r51 = r3
            r3 = 3
            r4.<init>(r0, r2, r3)
            androidx.camera.core.impl.utils.ExifTag r0 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r2 = "SensingMethod"
            r52 = r4
            r4 = 41495(0xa217, float:5.8147E-41)
            r0.<init>(r2, r4, r3)
            androidx.camera.core.impl.utils.ExifTag r2 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r3 = "FileSource"
            r4 = 41728(0xa300, float:5.8473E-41)
            r53 = r0
            r0 = 7
            r2.<init>(r3, r4, r0)
            androidx.camera.core.impl.utils.ExifTag r3 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r4 = "SceneType"
            r54 = r2
            r2 = 41729(0xa301, float:5.8475E-41)
            r3.<init>(r4, r2, r0)
            androidx.camera.core.impl.utils.ExifTag r0 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r2 = "CustomRendered"
            r4 = 41985(0xa401, float:5.8834E-41)
            r55 = r3
            r3 = 3
            r0.<init>(r2, r4, r3)
            androidx.camera.core.impl.utils.ExifTag r2 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r4 = "ExposureMode"
            r56 = r0
            r0 = 41986(0xa402, float:5.8835E-41)
            r2.<init>(r4, r0, r3)
            androidx.camera.core.impl.utils.ExifTag r0 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r4 = "WhiteBalance"
            r57 = r2
            r2 = 41987(0xa403, float:5.8836E-41)
            r0.<init>(r4, r2, r3)
            androidx.camera.core.impl.utils.ExifTag r2 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r4 = "SceneCaptureType"
            r58 = r0
            r0 = 41990(0xa406, float:5.884E-41)
            r2.<init>(r4, r0, r3)
            androidx.camera.core.impl.utils.ExifTag r0 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r4 = "Contrast"
            r59 = r2
            r2 = 41992(0xa408, float:5.8843E-41)
            r0.<init>(r4, r2, r3)
            androidx.camera.core.impl.utils.ExifTag r2 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r4 = "Saturation"
            r60 = r0
            r0 = 41993(0xa409, float:5.8845E-41)
            r2.<init>(r4, r0, r3)
            androidx.camera.core.impl.utils.ExifTag r0 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r4 = "Sharpness"
            r61 = r2
            r2 = 41994(0xa40a, float:5.8846E-41)
            r0.<init>(r4, r2, r3)
            r2 = 37
            androidx.camera.core.impl.utils.ExifTag[] r2 = new androidx.camera.core.impl.utils.ExifTag[r2]
            r2[r19] = r31
            r2[r28] = r13
            r16 = 2
            r2[r16] = r8
            r2[r3] = r35
            r22 = 4
            r2[r22] = r5
            r18 = 5
            r2[r18] = r32
            r2[r27] = r7
            r30 = 7
            r2[r30] = r6
            r2[r20] = r33
            r2[r21] = r34
            r29 = 10
            r2[r29] = r9
            r2[r24] = r36
            r2[r26] = r37
            r2[r25] = r38
            r2[r23] = r39
            r3 = 15
            r2[r3] = r40
            r3 = 16
            r2[r3] = r41
            r4 = 17
            r2[r4] = r42
            r4 = 18
            r2[r4] = r43
            r4 = 19
            r2[r4] = r44
            r4 = 20
            r2[r4] = r45
            r4 = 21
            r2[r4] = r46
            r4 = 22
            r2[r4] = r47
            r4 = 23
            r2[r4] = r49
            r5 = 24
            r2[r5] = r50
            r5 = 25
            r2[r5] = r51
            r6 = 26
            r2[r6] = r52
            r6 = 27
            r2[r6] = r53
            r6 = 28
            r2[r6] = r54
            r6 = 29
            r2[r6] = r55
            r6 = 30
            r2[r6] = r56
            r6 = 31
            r2[r6] = r57
            r6 = 32
            r2[r6] = r58
            r6 = 33
            r2[r6] = r59
            r6 = 34
            r2[r6] = r60
            r6 = 35
            r2[r6] = r61
            r6 = 36
            r2[r6] = r0
            androidx.camera.core.impl.utils.ExifData.IFD_EXIF_TAGS = r2
            androidx.camera.core.impl.utils.ExifTag r0 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r6 = "GPSVersionID"
            r7 = 0
            r8 = 1
            r0.<init>(r6, r7, r8)
            androidx.camera.core.impl.utils.ExifTag r6 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r7 = "GPSLatitudeRef"
            r9 = 2
            r6.<init>(r7, r8, r9)
            androidx.camera.core.impl.utils.ExifTag r7 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r8 = "GPSLatitude"
            r5 = 10
            r13 = 5
            r7.<init>(r8, r9, r13, r5)
            androidx.camera.core.impl.utils.ExifTag r8 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r4 = "GPSLongitudeRef"
            r3 = 3
            r8.<init>(r4, r3, r9)
            androidx.camera.core.impl.utils.ExifTag r3 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r4 = "GPSLongitude"
            r9 = 4
            r3.<init>(r4, r9, r13, r5)
            androidx.camera.core.impl.utils.ExifTag r4 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r5 = "GPSAltitudeRef"
            r9 = 1
            r4.<init>(r5, r13, r9)
            androidx.camera.core.impl.utils.ExifTag r5 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r9 = "GPSAltitude"
            r34 = r0
            r0 = 6
            r5.<init>(r9, r0, r13)
            androidx.camera.core.impl.utils.ExifTag r0 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r9 = "GPSTimeStamp"
            r35 = r2
            r2 = 7
            r0.<init>(r9, r2, r13)
            androidx.camera.core.impl.utils.ExifTag r2 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r13 = "GPSSpeedRef"
            r36 = r0
            r37 = r3
            r0 = 2
            r3 = 12
            r2.<init>(r13, r3, r0)
            androidx.camera.core.impl.utils.ExifTag r3 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r13 = "GPSTrackRef"
            r38 = r2
            r2 = 14
            r3.<init>(r13, r2, r0)
            androidx.camera.core.impl.utils.ExifTag r2 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r13 = "GPSImgDirectionRef"
            r23 = r3
            r3 = 16
            r2.<init>(r13, r3, r0)
            androidx.camera.core.impl.utils.ExifTag r3 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r13 = "GPSDestBearingRef"
            r33 = r2
            r2 = 23
            r3.<init>(r13, r2, r0)
            androidx.camera.core.impl.utils.ExifTag r2 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r13 = "GPSDestDistanceRef"
            r32 = r3
            r3 = 25
            r2.<init>(r13, r3, r0)
            r3 = 13
            androidx.camera.core.impl.utils.ExifTag[] r3 = new androidx.camera.core.impl.utils.ExifTag[r3]
            r19 = 0
            r3[r19] = r34
            r28 = 1
            r3[r28] = r6
            r3[r0] = r7
            r17 = 3
            r3[r17] = r8
            r0 = 4
            r3[r0] = r37
            r18 = 5
            r3[r18] = r4
            r27 = 6
            r3[r27] = r5
            r30 = 7
            r3[r30] = r36
            r3[r20] = r38
            r3[r21] = r23
            r29 = 10
            r3[r29] = r33
            r3[r24] = r32
            r26 = 12
            r3[r26] = r2
            androidx.camera.core.impl.utils.ExifData.IFD_GPS_TAGS = r3
            androidx.camera.core.impl.utils.ExifTag r2 = new androidx.camera.core.impl.utils.ExifTag
            r4 = 330(0x14a, float:4.62E-43)
            r2.<init>(r15, r4, r0)
            androidx.camera.core.impl.utils.ExifTag r4 = new androidx.camera.core.impl.utils.ExifTag
            r5 = 34665(0x8769, float:4.8576E-41)
            r4.<init>(r11, r5, r0)
            androidx.camera.core.impl.utils.ExifTag r5 = new androidx.camera.core.impl.utils.ExifTag
            r6 = 34853(0x8825, float:4.884E-41)
            r5.<init>(r1, r6, r0)
            androidx.camera.core.impl.utils.ExifTag r1 = new androidx.camera.core.impl.utils.ExifTag
            r6 = 40965(0xa005, float:5.7404E-41)
            r1.<init>(r10, r6, r0)
            androidx.camera.core.impl.utils.ExifTag[] r6 = new androidx.camera.core.impl.utils.ExifTag[r0]
            r19 = 0
            r6[r19] = r2
            r8 = 1
            r6[r8] = r4
            r0 = 2
            r6[r0] = r5
            r17 = 3
            r6[r17] = r1
            androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS = r6
            androidx.camera.core.impl.utils.ExifTag r1 = new androidx.camera.core.impl.utils.ExifTag
            java.lang.String r2 = "InteroperabilityIndex"
            r1.<init>(r2, r8, r0)
            androidx.camera.core.impl.utils.ExifTag[] r2 = new androidx.camera.core.impl.utils.ExifTag[r8]
            r2[r19] = r1
            androidx.camera.core.impl.utils.ExifData.IFD_INTEROPERABILITY_TAGS = r2
            r4 = 4
            androidx.camera.core.impl.utils.ExifTag[][] r1 = new androidx.camera.core.impl.utils.ExifTag[r4][]
            r1[r19] = r48
            r1[r8] = r35
            r1[r0] = r3
            r17 = 3
            r1[r17] = r2
            androidx.camera.core.impl.utils.ExifData.EXIF_TAGS = r1
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String[] r1 = new java.lang.String[]{r12, r14, r9}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            androidx.camera.core.impl.utils.ExifData.sTagSetForCompatibility = r0
            return
    }

    ExifData(java.nio.ByteOrder r3, java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> r4) {
            r2 = this;
            r2.<init>()
            int r0 = r4.size()
            androidx.camera.core.impl.utils.ExifTag[][] r1 = androidx.camera.core.impl.utils.ExifData.EXIF_TAGS
            int r1 = r1.length
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.lang.String r1 = "Malformed attributes list. Number of IFDs mismatch."
            androidx.core.util.Preconditions.checkState(r0, r1)
            r2.mByteOrder = r3
            r2.mAttributes = r4
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.ExifData.Builder builderForDevice() {
            androidx.camera.core.impl.utils.ExifData$Builder r0 = new androidx.camera.core.impl.utils.ExifData$Builder
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r0.<init>(r1)
            r1 = 1
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Orientation"
            androidx.camera.core.impl.utils.ExifData$Builder r0 = r0.setAttribute(r3, r2)
            java.lang.String r2 = "XResolution"
            java.lang.String r3 = "72/1"
            androidx.camera.core.impl.utils.ExifData$Builder r0 = r0.setAttribute(r2, r3)
            java.lang.String r2 = "YResolution"
            androidx.camera.core.impl.utils.ExifData$Builder r0 = r0.setAttribute(r2, r3)
            r2 = 2
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "ResolutionUnit"
            androidx.camera.core.impl.utils.ExifData$Builder r0 = r0.setAttribute(r3, r2)
            java.lang.String r2 = "YCbCrPositioning"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            androidx.camera.core.impl.utils.ExifData$Builder r0 = r0.setAttribute(r2, r1)
            java.lang.String r1 = "Make"
            java.lang.String r2 = android.os.Build.MANUFACTURER
            androidx.camera.core.impl.utils.ExifData$Builder r0 = r0.setAttribute(r1, r2)
            java.lang.String r1 = "Model"
            java.lang.String r2 = android.os.Build.MODEL
            androidx.camera.core.impl.utils.ExifData$Builder r0 = r0.setAttribute(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.ExifData create(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r2, int r3) {
            androidx.camera.core.impl.utils.ExifData$Builder r0 = builderForDevice()
            androidx.camera.core.ImageInfo r1 = r2.getImageInfo()
            if (r1 == 0) goto L11
            androidx.camera.core.ImageInfo r1 = r2.getImageInfo()
            r1.populateExifData(r0)
        L11:
            r0.setOrientationDegrees(r3)
            int r3 = r2.getWidth()
            androidx.camera.core.impl.utils.ExifData$Builder r3 = r0.setImageWidth(r3)
            int r2 = r2.getHeight()
            androidx.camera.core.impl.utils.ExifData$Builder r2 = r3.setImageHeight(r2)
            androidx.camera.core.impl.utils.ExifData r2 = r2.build()
            return r2
    }

    @androidx.annotation.Nullable
    private androidx.camera.core.impl.utils.ExifAttribute getExifAttribute(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "ISOSpeedRatings"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto La
            java.lang.String r3 = "PhotographicSensitivity"
        La:
            r0 = 0
        Lb:
            androidx.camera.core.impl.utils.ExifTag[][] r1 = androidx.camera.core.impl.utils.ExifData.EXIF_TAGS
            int r1 = r1.length
            if (r0 >= r1) goto L24
            java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> r1 = r2.mAttributes
            java.lang.Object r1 = r1.get(r0)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r1.get(r3)
            androidx.camera.core.impl.utils.ExifAttribute r1 = (androidx.camera.core.impl.utils.ExifAttribute) r1
            if (r1 == 0) goto L21
            return r1
        L21:
            int r0 = r0 + 1
            goto Lb
        L24:
            r3 = 0
            return r3
    }

    @androidx.annotation.Nullable
    public java.lang.String getAttribute(@androidx.annotation.NonNull java.lang.String r11) {
            r10 = this;
            androidx.camera.core.impl.utils.ExifAttribute r0 = r10.getExifAttribute(r11)
            r1 = 0
            if (r0 == 0) goto Lc3
            java.util.HashSet<java.lang.String> r2 = androidx.camera.core.impl.utils.ExifData.sTagSetForCompatibility
            boolean r2 = r2.contains(r11)
            if (r2 != 0) goto L16
            java.nio.ByteOrder r11 = r10.mByteOrder
            java.lang.String r11 = r0.getStringValue(r11)
            return r11
        L16:
            java.lang.String r2 = "GPSTimeStamp"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto Lb8
            int r11 = r0.format
            r2 = 5
            java.lang.String r3 = "ExifData"
            if (r11 == r2) goto L40
            r2 = 10
            if (r11 == r2) goto L40
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "GPS Timestamp format is not rational. format="
            r11.append(r2)
            int r0 = r0.format
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            androidx.camera.core.Logger.w(r3, r11)
            return r1
        L40:
            java.nio.ByteOrder r11 = r10.mByteOrder
            java.lang.Object r11 = r0.getValue(r11)
            androidx.camera.core.impl.utils.LongRational[] r11 = (androidx.camera.core.impl.utils.LongRational[]) r11
            if (r11 == 0) goto L9f
            int r0 = r11.length
            r2 = 3
            if (r0 == r2) goto L4f
            goto L9f
        L4f:
            java.util.Locale r0 = java.util.Locale.US
            r1 = 0
            r3 = r11[r1]
            long r3 = r3.getNumerator()
            float r3 = (float) r3
            r4 = r11[r1]
            long r4 = r4.getDenominator()
            float r4 = (float) r4
            float r3 = r3 / r4
            int r3 = (int) r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r5 = r11[r4]
            long r5 = r5.getNumerator()
            float r5 = (float) r5
            r6 = r11[r4]
            long r6 = r6.getDenominator()
            float r6 = (float) r6
            float r5 = r5 / r6
            int r5 = (int) r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 2
            r7 = r11[r6]
            long r7 = r7.getNumerator()
            float r7 = (float) r7
            r11 = r11[r6]
            long r8 = r11.getDenominator()
            float r11 = (float) r8
            float r7 = r7 / r11
            int r11 = (int) r7
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r3
            r2[r4] = r5
            r2[r6] = r11
            java.lang.String r11 = "%02d:%02d:%02d"
            java.lang.String r11 = java.lang.String.format(r0, r11, r2)
            return r11
        L9f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Invalid GPS Timestamp array. array="
            r0.append(r2)
            java.lang.String r11 = java.util.Arrays.toString(r11)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            androidx.camera.core.Logger.w(r3, r11)
            return r1
        Lb8:
            java.nio.ByteOrder r11 = r10.mByteOrder     // Catch: java.lang.NumberFormatException -> Lc3
            double r2 = r0.getDoubleValue(r11)     // Catch: java.lang.NumberFormatException -> Lc3
            java.lang.String r11 = java.lang.Double.toString(r2)     // Catch: java.lang.NumberFormatException -> Lc3
            return r11
        Lc3:
            return r1
    }

    @androidx.annotation.NonNull
    java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute> getAttributes(int r4) {
            r3 = this;
            androidx.camera.core.impl.utils.ExifTag[][] r0 = androidx.camera.core.impl.utils.ExifData.EXIF_TAGS
            int r0 = r0.length
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid IFD index: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ". Index should be between [0, EXIF_TAGS.length] "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            androidx.core.util.Preconditions.checkArgumentInRange(r4, r2, r0, r1)
            java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> r0 = r3.mAttributes
            java.lang.Object r4 = r0.get(r4)
            java.util.Map r4 = (java.util.Map) r4
            return r4
    }

    @androidx.annotation.NonNull
    public java.nio.ByteOrder getByteOrder() {
            r1 = this;
            java.nio.ByteOrder r0 = r1.mByteOrder
            return r0
    }
}
