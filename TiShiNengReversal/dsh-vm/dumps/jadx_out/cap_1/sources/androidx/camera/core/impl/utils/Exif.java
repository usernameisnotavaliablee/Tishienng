package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Exif {
    private static final java.util.List<java.lang.String> ALL_EXIF_TAGS = null;
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> DATETIME_FORMAT = null;
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> DATE_FORMAT = null;
    private static final java.util.List<java.lang.String> DO_NOT_COPY_EXIF_TAGS = null;
    public static final long INVALID_TIMESTAMP = -1;
    private static final java.lang.String KILOMETERS_PER_HOUR = "K";
    private static final java.lang.String KNOTS = "N";
    private static final java.lang.String MILES_PER_HOUR = "M";
    private static final java.lang.String TAG = "Exif";
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> TIME_FORMAT = null;
    private final androidx.exifinterface.media.ExifInterface mExifInterface;
    private boolean mRemoveTimestamp;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Speed {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class Converter {
            final double mMph;

            Converter(double r1) {
                    r0 = this;
                    r0.<init>()
                    r0.mMph = r1
                    return
            }

            double toMetersPerSecond() {
                    r4 = this;
                    double r0 = r4.mMph
                    r2 = 4612219559875242487(0x4001e540cc78e9f7, double:2.23694)
                    double r0 = r0 / r2
                    return r0
            }
        }

        private Speed() {
                r0 = this;
                r0.<init>()
                return
        }

        static androidx.camera.core.impl.utils.Exif.Speed.Converter fromKilometersPerHour(double r3) {
                androidx.camera.core.impl.utils.Exif$Speed$Converter r0 = new androidx.camera.core.impl.utils.Exif$Speed$Converter
                r1 = 4603772031953394081(0x3fe3e2456f75d9a1, double:0.621371)
                double r3 = r3 * r1
                r0.<init>(r3)
                return r0
        }

        static androidx.camera.core.impl.utils.Exif.Speed.Converter fromKnots(double r3) {
                androidx.camera.core.impl.utils.Exif$Speed$Converter r0 = new androidx.camera.core.impl.utils.Exif$Speed$Converter
                r1 = 4607861471551832331(0x3ff269984a0e410b, double:1.15078)
                double r3 = r3 * r1
                r0.<init>(r3)
                return r0
        }

        static androidx.camera.core.impl.utils.Exif.Speed.Converter fromMilesPerHour(double r1) {
                androidx.camera.core.impl.utils.Exif$Speed$Converter r0 = new androidx.camera.core.impl.utils.Exif$Speed$Converter
                r0.<init>(r1)
                return r0
        }
    }

    static {
            androidx.camera.core.impl.utils.Exif$1 r0 = new androidx.camera.core.impl.utils.Exif$1
            r0.<init>()
            androidx.camera.core.impl.utils.Exif.DATE_FORMAT = r0
            androidx.camera.core.impl.utils.Exif$2 r0 = new androidx.camera.core.impl.utils.Exif$2
            r0.<init>()
            androidx.camera.core.impl.utils.Exif.TIME_FORMAT = r0
            androidx.camera.core.impl.utils.Exif$3 r0 = new androidx.camera.core.impl.utils.Exif$3
            r0.<init>()
            androidx.camera.core.impl.utils.Exif.DATETIME_FORMAT = r0
            java.util.List r0 = getAllExifTags()
            androidx.camera.core.impl.utils.Exif.ALL_EXIF_TAGS = r0
            java.lang.String r9 = "ThumbnailImageWidth"
            java.lang.String r10 = "ThumbnailOrientation"
            java.lang.String r1 = "ImageWidth"
            java.lang.String r2 = "ImageLength"
            java.lang.String r3 = "PixelXDimension"
            java.lang.String r4 = "PixelYDimension"
            java.lang.String r5 = "Compression"
            java.lang.String r6 = "JPEGInterchangeFormat"
            java.lang.String r7 = "JPEGInterchangeFormatLength"
            java.lang.String r8 = "ThumbnailImageLength"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r0 = java.util.Arrays.asList(r0)
            androidx.camera.core.impl.utils.Exif.DO_NOT_COPY_EXIF_TAGS = r0
            return
    }

    private Exif(androidx.exifinterface.media.ExifInterface r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mRemoveTimestamp = r0
            r1.mExifInterface = r2
            return
    }

    private void attachLastModifiedTimestamp() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = convertToExifDateTime(r0)
            androidx.exifinterface.media.ExifInterface r3 = r5.mExifInterface
            java.lang.String r4 = "DateTime"
            r3.setAttribute(r4, r2)
            java.util.Date r2 = convertFromExifDateTime(r2)     // Catch: java.text.ParseException -> L23
            long r2 = r2.getTime()     // Catch: java.text.ParseException -> L23
            long r0 = r0 - r2
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch: java.text.ParseException -> L23
            androidx.exifinterface.media.ExifInterface r1 = r5.mExifInterface     // Catch: java.text.ParseException -> L23
            java.lang.String r2 = "SubSecTime"
            r1.setAttribute(r2, r0)     // Catch: java.text.ParseException -> L23
        L23:
            return
    }

    private static java.util.Date convertFromExifDate(java.lang.String r1) throws java.text.ParseException {
            java.lang.ThreadLocal<java.text.SimpleDateFormat> r0 = androidx.camera.core.impl.utils.Exif.DATE_FORMAT
            java.lang.Object r0 = r0.get()
            java.text.SimpleDateFormat r0 = (java.text.SimpleDateFormat) r0
            java.util.Date r1 = r0.parse(r1)
            return r1
    }

    private static java.util.Date convertFromExifDateTime(java.lang.String r1) throws java.text.ParseException {
            java.lang.ThreadLocal<java.text.SimpleDateFormat> r0 = androidx.camera.core.impl.utils.Exif.DATETIME_FORMAT
            java.lang.Object r0 = r0.get()
            java.text.SimpleDateFormat r0 = (java.text.SimpleDateFormat) r0
            java.util.Date r1 = r0.parse(r1)
            return r1
    }

    private static java.util.Date convertFromExifTime(java.lang.String r1) throws java.text.ParseException {
            java.lang.ThreadLocal<java.text.SimpleDateFormat> r0 = androidx.camera.core.impl.utils.Exif.TIME_FORMAT
            java.lang.Object r0 = r0.get()
            java.text.SimpleDateFormat r0 = (java.text.SimpleDateFormat) r0
            java.util.Date r1 = r0.parse(r1)
            return r1
    }

    private static java.lang.String convertToExifDateTime(long r2) {
            java.lang.ThreadLocal<java.text.SimpleDateFormat> r0 = androidx.camera.core.impl.utils.Exif.DATETIME_FORMAT
            java.lang.Object r0 = r0.get()
            java.text.SimpleDateFormat r0 = (java.text.SimpleDateFormat) r0
            java.util.Date r1 = new java.util.Date
            r1.<init>(r2)
            java.lang.String r2 = r0.format(r1)
            return r2
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.Exif createFromFile(@androidx.annotation.NonNull java.io.File r0) throws java.io.IOException {
            java.lang.String r0 = r0.toString()
            androidx.camera.core.impl.utils.Exif r0 = createFromFileString(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.Exif createFromFileString(@androidx.annotation.NonNull java.lang.String r2) throws java.io.IOException {
            androidx.camera.core.impl.utils.Exif r0 = new androidx.camera.core.impl.utils.Exif
            androidx.exifinterface.media.ExifInterface r1 = new androidx.exifinterface.media.ExifInterface
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.Exif createFromImageProxy(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r1) throws java.io.IOException {
            androidx.camera.core.ImageProxy$PlaneProxy[] r1 = r1.getPlanes()
            r0 = 0
            r1 = r1[r0]
            java.nio.ByteBuffer r1 = r1.getBuffer()
            r1.rewind()
            int r0 = r1.capacity()
            byte[] r0 = new byte[r0]
            r1.get(r0)
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r0)
            androidx.camera.core.impl.utils.Exif r1 = createFromInputStream(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.Exif createFromInputStream(@androidx.annotation.NonNull java.io.InputStream r2) throws java.io.IOException {
            androidx.camera.core.impl.utils.Exif r0 = new androidx.camera.core.impl.utils.Exif
            androidx.exifinterface.media.ExifInterface r1 = new androidx.exifinterface.media.ExifInterface
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.List<java.lang.String> getAllExifTags() {
            java.lang.String r152 = "NewSubfileType"
            java.lang.String r153 = "SubfileType"
            java.lang.String r1 = "ImageWidth"
            java.lang.String r2 = "ImageLength"
            java.lang.String r3 = "BitsPerSample"
            java.lang.String r4 = "Compression"
            java.lang.String r5 = "PhotometricInterpretation"
            java.lang.String r6 = "Orientation"
            java.lang.String r7 = "SamplesPerPixel"
            java.lang.String r8 = "PlanarConfiguration"
            java.lang.String r9 = "YCbCrSubSampling"
            java.lang.String r10 = "YCbCrPositioning"
            java.lang.String r11 = "XResolution"
            java.lang.String r12 = "YResolution"
            java.lang.String r13 = "ResolutionUnit"
            java.lang.String r14 = "StripOffsets"
            java.lang.String r15 = "RowsPerStrip"
            java.lang.String r16 = "StripByteCounts"
            java.lang.String r17 = "JPEGInterchangeFormat"
            java.lang.String r18 = "JPEGInterchangeFormatLength"
            java.lang.String r19 = "TransferFunction"
            java.lang.String r20 = "WhitePoint"
            java.lang.String r21 = "PrimaryChromaticities"
            java.lang.String r22 = "YCbCrCoefficients"
            java.lang.String r23 = "ReferenceBlackWhite"
            java.lang.String r24 = "DateTime"
            java.lang.String r25 = "ImageDescription"
            java.lang.String r26 = "Make"
            java.lang.String r27 = "Model"
            java.lang.String r28 = "Software"
            java.lang.String r29 = "Artist"
            java.lang.String r30 = "Copyright"
            java.lang.String r31 = "ExifVersion"
            java.lang.String r32 = "FlashpixVersion"
            java.lang.String r33 = "ColorSpace"
            java.lang.String r34 = "Gamma"
            java.lang.String r35 = "PixelXDimension"
            java.lang.String r36 = "PixelYDimension"
            java.lang.String r37 = "ComponentsConfiguration"
            java.lang.String r38 = "CompressedBitsPerPixel"
            java.lang.String r39 = "MakerNote"
            java.lang.String r40 = "UserComment"
            java.lang.String r41 = "RelatedSoundFile"
            java.lang.String r42 = "DateTimeOriginal"
            java.lang.String r43 = "DateTimeDigitized"
            java.lang.String r44 = "OffsetTime"
            java.lang.String r45 = "OffsetTimeOriginal"
            java.lang.String r46 = "OffsetTimeDigitized"
            java.lang.String r47 = "SubSecTime"
            java.lang.String r48 = "SubSecTimeOriginal"
            java.lang.String r49 = "SubSecTimeDigitized"
            java.lang.String r50 = "ExposureTime"
            java.lang.String r51 = "FNumber"
            java.lang.String r52 = "ExposureProgram"
            java.lang.String r53 = "SpectralSensitivity"
            java.lang.String r54 = "PhotographicSensitivity"
            java.lang.String r55 = "OECF"
            java.lang.String r56 = "SensitivityType"
            java.lang.String r57 = "StandardOutputSensitivity"
            java.lang.String r58 = "RecommendedExposureIndex"
            java.lang.String r59 = "ISOSpeed"
            java.lang.String r60 = "ISOSpeedLatitudeyyy"
            java.lang.String r61 = "ISOSpeedLatitudezzz"
            java.lang.String r62 = "ShutterSpeedValue"
            java.lang.String r63 = "ApertureValue"
            java.lang.String r64 = "BrightnessValue"
            java.lang.String r65 = "ExposureBiasValue"
            java.lang.String r66 = "MaxApertureValue"
            java.lang.String r67 = "SubjectDistance"
            java.lang.String r68 = "MeteringMode"
            java.lang.String r69 = "LightSource"
            java.lang.String r70 = "Flash"
            java.lang.String r71 = "SubjectArea"
            java.lang.String r72 = "FocalLength"
            java.lang.String r73 = "FlashEnergy"
            java.lang.String r74 = "SpatialFrequencyResponse"
            java.lang.String r75 = "FocalPlaneXResolution"
            java.lang.String r76 = "FocalPlaneYResolution"
            java.lang.String r77 = "FocalPlaneResolutionUnit"
            java.lang.String r78 = "SubjectLocation"
            java.lang.String r79 = "ExposureIndex"
            java.lang.String r80 = "SensingMethod"
            java.lang.String r81 = "FileSource"
            java.lang.String r82 = "SceneType"
            java.lang.String r83 = "CFAPattern"
            java.lang.String r84 = "CustomRendered"
            java.lang.String r85 = "ExposureMode"
            java.lang.String r86 = "WhiteBalance"
            java.lang.String r87 = "DigitalZoomRatio"
            java.lang.String r88 = "FocalLengthIn35mmFilm"
            java.lang.String r89 = "SceneCaptureType"
            java.lang.String r90 = "GainControl"
            java.lang.String r91 = "Contrast"
            java.lang.String r92 = "Saturation"
            java.lang.String r93 = "Sharpness"
            java.lang.String r94 = "DeviceSettingDescription"
            java.lang.String r95 = "SubjectDistanceRange"
            java.lang.String r96 = "ImageUniqueID"
            java.lang.String r97 = "CameraOwnerName"
            java.lang.String r98 = "BodySerialNumber"
            java.lang.String r99 = "LensSpecification"
            java.lang.String r100 = "LensMake"
            java.lang.String r101 = "LensModel"
            java.lang.String r102 = "LensSerialNumber"
            java.lang.String r103 = "GPSVersionID"
            java.lang.String r104 = "GPSLatitudeRef"
            java.lang.String r105 = "GPSLatitude"
            java.lang.String r106 = "GPSLongitudeRef"
            java.lang.String r107 = "GPSLongitude"
            java.lang.String r108 = "GPSAltitudeRef"
            java.lang.String r109 = "GPSAltitude"
            java.lang.String r110 = "GPSTimeStamp"
            java.lang.String r111 = "GPSSatellites"
            java.lang.String r112 = "GPSStatus"
            java.lang.String r113 = "GPSMeasureMode"
            java.lang.String r114 = "GPSDOP"
            java.lang.String r115 = "GPSSpeedRef"
            java.lang.String r116 = "GPSSpeed"
            java.lang.String r117 = "GPSTrackRef"
            java.lang.String r118 = "GPSTrack"
            java.lang.String r119 = "GPSImgDirectionRef"
            java.lang.String r120 = "GPSImgDirection"
            java.lang.String r121 = "GPSMapDatum"
            java.lang.String r122 = "GPSDestLatitudeRef"
            java.lang.String r123 = "GPSDestLatitude"
            java.lang.String r124 = "GPSDestLongitudeRef"
            java.lang.String r125 = "GPSDestLongitude"
            java.lang.String r126 = "GPSDestBearingRef"
            java.lang.String r127 = "GPSDestBearing"
            java.lang.String r128 = "GPSDestDistanceRef"
            java.lang.String r129 = "GPSDestDistance"
            java.lang.String r130 = "GPSProcessingMethod"
            java.lang.String r131 = "GPSAreaInformation"
            java.lang.String r132 = "GPSDateStamp"
            java.lang.String r133 = "GPSDifferential"
            java.lang.String r134 = "GPSHPositioningError"
            java.lang.String r135 = "InteroperabilityIndex"
            java.lang.String r136 = "ThumbnailImageLength"
            java.lang.String r137 = "ThumbnailImageWidth"
            java.lang.String r138 = "ThumbnailOrientation"
            java.lang.String r139 = "DNGVersion"
            java.lang.String r140 = "DefaultCropSize"
            java.lang.String r141 = "ThumbnailImage"
            java.lang.String r142 = "PreviewImageStart"
            java.lang.String r143 = "PreviewImageLength"
            java.lang.String r144 = "AspectFrame"
            java.lang.String r145 = "SensorBottomBorder"
            java.lang.String r146 = "SensorLeftBorder"
            java.lang.String r147 = "SensorRightBorder"
            java.lang.String r148 = "SensorTopBorder"
            java.lang.String r149 = "ISO"
            java.lang.String r150 = "JpgFromRaw"
            java.lang.String r151 = "Xmp"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153}
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    private long parseTimestamp(@androidx.annotation.Nullable java.lang.String r3) {
            r2 = this;
            r0 = -1
            if (r3 != 0) goto L5
            return r0
        L5:
            java.util.Date r3 = convertFromExifDateTime(r3)     // Catch: java.text.ParseException -> Ld
            long r0 = r3.getTime()     // Catch: java.text.ParseException -> Ld
        Ld:
            return r0
    }

    private long parseTimestamp(@androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4) {
            r2 = this;
            r0 = -1
            if (r3 != 0) goto L7
            if (r4 != 0) goto L7
            return r0
        L7:
            if (r4 != 0) goto L13
            java.util.Date r3 = convertFromExifDate(r3)     // Catch: java.text.ParseException -> L12
            long r3 = r3.getTime()     // Catch: java.text.ParseException -> L12
            return r3
        L12:
            return r0
        L13:
            if (r3 != 0) goto L1f
            java.util.Date r3 = convertFromExifTime(r4)     // Catch: java.text.ParseException -> L1e
            long r3 = r3.getTime()     // Catch: java.text.ParseException -> L1e
            return r3
        L1e:
            return r0
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = " "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            long r3 = r2.parseTimestamp(r3)
            return r3
    }

    public void attachLocation(@androidx.annotation.NonNull android.location.Location r2) {
            r1 = this;
            androidx.exifinterface.media.ExifInterface r0 = r1.mExifInterface
            r0.setGpsInfo(r2)
            return
    }

    public void attachTimestamp() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = convertToExifDateTime(r0)
            androidx.exifinterface.media.ExifInterface r3 = r5.mExifInterface
            java.lang.String r4 = "DateTimeOriginal"
            r3.setAttribute(r4, r2)
            androidx.exifinterface.media.ExifInterface r3 = r5.mExifInterface
            java.lang.String r4 = "DateTimeDigitized"
            r3.setAttribute(r4, r2)
            java.util.Date r2 = convertFromExifDateTime(r2)     // Catch: java.text.ParseException -> L31
            long r2 = r2.getTime()     // Catch: java.text.ParseException -> L31
            long r0 = r0 - r2
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch: java.text.ParseException -> L31
            androidx.exifinterface.media.ExifInterface r1 = r5.mExifInterface     // Catch: java.text.ParseException -> L31
            java.lang.String r2 = "SubSecTimeOriginal"
            r1.setAttribute(r2, r0)     // Catch: java.text.ParseException -> L31
            androidx.exifinterface.media.ExifInterface r1 = r5.mExifInterface     // Catch: java.text.ParseException -> L31
            java.lang.String r2 = "SubSecTimeDigitized"
            r1.setAttribute(r2, r0)     // Catch: java.text.ParseException -> L31
        L31:
            r0 = 0
            r5.mRemoveTimestamp = r0
            return
    }

    public void copyToCroppedImage(@androidx.annotation.NonNull androidx.camera.core.impl.utils.Exif r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<java.lang.String> r1 = androidx.camera.core.impl.utils.Exif.ALL_EXIF_TAGS
            r0.<init>(r1)
            java.util.List<java.lang.String> r1 = androidx.camera.core.impl.utils.Exif.DO_NOT_COPY_EXIF_TAGS
            r0.removeAll(r1)
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            androidx.exifinterface.media.ExifInterface r2 = r4.mExifInterface
            java.lang.String r2 = r2.getAttribute(r1)
            androidx.exifinterface.media.ExifInterface r3 = r5.mExifInterface
            java.lang.String r3 = r3.getAttribute(r1)
            if (r2 == 0) goto L10
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L10
            androidx.exifinterface.media.ExifInterface r3 = r5.mExifInterface
            r3.setAttribute(r1, r2)
            goto L10
        L36:
            return
    }

    public void flipHorizontally() {
            r3 = this;
            int r0 = r3.getOrientation()
            switch(r0) {
                case 2: goto L16;
                case 3: goto L14;
                case 4: goto L12;
                case 5: goto L10;
                case 6: goto Le;
                case 7: goto Lb;
                case 8: goto L9;
                default: goto L7;
            }
        L7:
            r0 = 2
            goto L17
        L9:
            r0 = 7
            goto L17
        Lb:
            r0 = 8
            goto L17
        Le:
            r0 = 5
            goto L17
        L10:
            r0 = 6
            goto L17
        L12:
            r0 = 3
            goto L17
        L14:
            r0 = 4
            goto L17
        L16:
            r0 = 1
        L17:
            androidx.exifinterface.media.ExifInterface r1 = r3.mExifInterface
            java.lang.String r2 = "Orientation"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setAttribute(r2, r0)
            return
    }

    public void flipVertically() {
            r3 = this;
            int r0 = r3.getOrientation()
            switch(r0) {
                case 2: goto L16;
                case 3: goto L14;
                case 4: goto L12;
                case 5: goto Lf;
                case 6: goto Ld;
                case 7: goto Lb;
                case 8: goto L9;
                default: goto L7;
            }
        L7:
            r0 = 4
            goto L17
        L9:
            r0 = 5
            goto L17
        Lb:
            r0 = 6
            goto L17
        Ld:
            r0 = 7
            goto L17
        Lf:
            r0 = 8
            goto L17
        L12:
            r0 = 1
            goto L17
        L14:
            r0 = 2
            goto L17
        L16:
            r0 = 3
        L17:
            androidx.exifinterface.media.ExifInterface r1 = r3.mExifInterface
            java.lang.String r2 = "Orientation"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setAttribute(r2, r0)
            return
    }

    @androidx.annotation.Nullable
    public java.lang.String getDescription() {
            r2 = this;
            androidx.exifinterface.media.ExifInterface r0 = r2.mExifInterface
            java.lang.String r1 = "ImageDescription"
            java.lang.String r0 = r0.getAttribute(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public androidx.exifinterface.media.ExifInterface getExifInterface() {
            r1 = this;
            androidx.exifinterface.media.ExifInterface r0 = r1.mExifInterface
            return r0
    }

    public int getHeight() {
            r3 = this;
            androidx.exifinterface.media.ExifInterface r0 = r3.mExifInterface
            java.lang.String r1 = "ImageLength"
            r2 = 0
            int r0 = r0.getAttributeInt(r1, r2)
            return r0
    }

    public long getLastModifiedTimestamp() {
            r7 = this;
            androidx.exifinterface.media.ExifInterface r0 = r7.mExifInterface
            java.lang.String r1 = "DateTime"
            java.lang.String r0 = r0.getAttribute(r1)
            long r0 = r7.parseTimestamp(r0)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L13
            return r2
        L13:
            androidx.exifinterface.media.ExifInterface r2 = r7.mExifInterface
            java.lang.String r3 = "SubSecTime"
            java.lang.String r2 = r2.getAttribute(r3)
            if (r2 == 0) goto L2c
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L2c
        L21:
            r4 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L2b
            r4 = 10
            long r2 = r2 / r4
            goto L21
        L2b:
            long r0 = r0 + r2
        L2c:
            return r0
    }

    @androidx.annotation.Nullable
    public android.location.Location getLocation() {
            r15 = this;
            androidx.exifinterface.media.ExifInterface r0 = r15.mExifInterface
            java.lang.String r1 = "GPSProcessingMethod"
            java.lang.String r0 = r0.getAttribute(r1)
            androidx.exifinterface.media.ExifInterface r1 = r15.mExifInterface
            double[] r1 = r1.getLatLong()
            androidx.exifinterface.media.ExifInterface r2 = r15.mExifInterface
            r3 = 0
            double r5 = r2.getAltitude(r3)
            androidx.exifinterface.media.ExifInterface r2 = r15.mExifInterface
            java.lang.String r7 = "GPSSpeed"
            double r7 = r2.getAttributeDouble(r7, r3)
            androidx.exifinterface.media.ExifInterface r2 = r15.mExifInterface
            java.lang.String r9 = "GPSSpeedRef"
            java.lang.String r2 = r2.getAttribute(r9)
            java.lang.String r9 = "K"
            if (r2 != 0) goto L2b
            r2 = r9
        L2b:
            androidx.exifinterface.media.ExifInterface r10 = r15.mExifInterface
            java.lang.String r11 = "GPSDateStamp"
            java.lang.String r10 = r10.getAttribute(r11)
            androidx.exifinterface.media.ExifInterface r11 = r15.mExifInterface
            java.lang.String r12 = "GPSTimeStamp"
            java.lang.String r11 = r11.getAttribute(r12)
            long r10 = r15.parseTimestamp(r10, r11)
            if (r1 != 0) goto L43
            r0 = 0
            return r0
        L43:
            if (r0 != 0) goto L47
            java.lang.String r0 = androidx.camera.core.impl.utils.Exif.TAG
        L47:
            android.location.Location r12 = new android.location.Location
            r12.<init>(r0)
            r0 = 0
            r13 = r1[r0]
            r12.setLatitude(r13)
            r0 = 1
            r0 = r1[r0]
            r12.setLongitude(r0)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L5f
            r12.setAltitude(r5)
        L5f:
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 == 0) goto La6
            int r0 = r2.hashCode()
            r1 = 75
            if (r0 == r1) goto L96
            r1 = 77
            if (r0 == r1) goto L85
            r1 = 78
            if (r0 == r1) goto L74
            goto L9a
        L74:
            java.lang.String r0 = "N"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9a
            androidx.camera.core.impl.utils.Exif$Speed$Converter r0 = androidx.camera.core.impl.utils.Exif.Speed.fromKnots(r7)
            double r0 = r0.toMetersPerSecond()
            goto La2
        L85:
            java.lang.String r0 = "M"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9a
            androidx.camera.core.impl.utils.Exif$Speed$Converter r0 = androidx.camera.core.impl.utils.Exif.Speed.fromMilesPerHour(r7)
            double r0 = r0.toMetersPerSecond()
            goto La2
        L96:
            boolean r0 = r2.equals(r9)
        L9a:
            androidx.camera.core.impl.utils.Exif$Speed$Converter r0 = androidx.camera.core.impl.utils.Exif.Speed.fromKilometersPerHour(r7)
            double r0 = r0.toMetersPerSecond()
        La2:
            float r0 = (float) r0
            r12.setSpeed(r0)
        La6:
            r0 = -1
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 == 0) goto Laf
            r12.setTime(r10)
        Laf:
            return r12
    }

    public int getOrientation() {
            r3 = this;
            androidx.exifinterface.media.ExifInterface r0 = r3.mExifInterface
            java.lang.String r1 = "Orientation"
            r2 = 0
            int r0 = r0.getAttributeInt(r1, r2)
            return r0
    }

    public int getRotation() {
            r4 = this;
            int r0 = r4.getOrientation()
            r1 = 180(0xb4, float:2.52E-43)
            r2 = 90
            r3 = 270(0x10e, float:3.78E-43)
            switch(r0) {
                case 3: goto L12;
                case 4: goto L12;
                case 5: goto L11;
                case 6: goto L10;
                case 7: goto L10;
                case 8: goto Lf;
                default: goto Ld;
            }
        Ld:
            r0 = 0
            return r0
        Lf:
            return r3
        L10:
            return r2
        L11:
            return r3
        L12:
            return r1
    }

    public long getTimestamp() {
            r7 = this;
            androidx.exifinterface.media.ExifInterface r0 = r7.mExifInterface
            java.lang.String r1 = "DateTimeOriginal"
            java.lang.String r0 = r0.getAttribute(r1)
            long r0 = r7.parseTimestamp(r0)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L13
            return r2
        L13:
            androidx.exifinterface.media.ExifInterface r2 = r7.mExifInterface
            java.lang.String r3 = "SubSecTimeOriginal"
            java.lang.String r2 = r2.getAttribute(r3)
            if (r2 == 0) goto L2c
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L2c
        L21:
            r4 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L2b
            r4 = 10
            long r2 = r2 / r4
            goto L21
        L2b:
            long r0 = r0 + r2
        L2c:
            return r0
    }

    public int getWidth() {
            r3 = this;
            androidx.exifinterface.media.ExifInterface r0 = r3.mExifInterface
            java.lang.String r1 = "ImageWidth"
            r2 = 0
            int r0 = r0.getAttributeInt(r1, r2)
            return r0
    }

    public boolean isFlippedHorizontally() {
            r2 = this;
            int r0 = r2.getOrientation()
            r1 = 2
            if (r0 == r1) goto L9
            r0 = 0
            return r0
        L9:
            r0 = 1
            return r0
    }

    public boolean isFlippedVertically() {
            r3 = this;
            int r0 = r3.getOrientation()
            r1 = 4
            r2 = 1
            if (r0 == r1) goto L10
            r1 = 5
            if (r0 == r1) goto L10
            r1 = 7
            if (r0 == r1) goto L10
            r0 = 0
            return r0
        L10:
            return r2
    }

    public void removeLocation() {
            r3 = this;
            androidx.exifinterface.media.ExifInterface r0 = r3.mExifInterface
            java.lang.String r1 = "GPSProcessingMethod"
            r2 = 0
            r0.setAttribute(r1, r2)
            androidx.exifinterface.media.ExifInterface r0 = r3.mExifInterface
            java.lang.String r1 = "GPSLatitude"
            r0.setAttribute(r1, r2)
            androidx.exifinterface.media.ExifInterface r0 = r3.mExifInterface
            java.lang.String r1 = "GPSLatitudeRef"
            r0.setAttribute(r1, r2)
            androidx.exifinterface.media.ExifInterface r0 = r3.mExifInterface
            java.lang.String r1 = "GPSLongitude"
            r0.setAttribute(r1, r2)
            androidx.exifinterface.media.ExifInterface r0 = r3.mExifInterface
            java.lang.String r1 = "GPSLongitudeRef"
            r0.setAttribute(r1, r2)
            androidx.exifinterface.media.ExifInterface r0 = r3.mExifInterface
            java.lang.String r1 = "GPSAltitude"
            r0.setAttribute(r1, r2)
            androidx.exifinterface.media.ExifInterface r0 = r3.mExifInterface
            java.lang.String r1 = "GPSAltitudeRef"
            r0.setAttribute(r1, r2)
            androidx.exifinterface.media.ExifInterface r0 = r3.mExifInterface
            java.lang.String r1 = "GPSSpeed"
            r0.setAttribute(r1, r2)
            androidx.exifinterface.media.ExifInterface r0 = r3.mExifInterface
            java.lang.String r1 = "GPSSpeedRef"
            r0.setAttribute(r1, r2)
            androidx.exifinterface.media.ExifInterface r0 = r3.mExifInterface
            java.lang.String r1 = "GPSDateStamp"
            r0.setAttribute(r1, r2)
            androidx.exifinterface.media.ExifInterface r0 = r3.mExifInterface
            java.lang.String r1 = "GPSTimeStamp"
            r0.setAttribute(r1, r2)
            return
    }

    public void removeTimestamp() {
            r3 = this;
            androidx.exifinterface.media.ExifInterface r0 = r3.mExifInterface
            java.lang.String r1 = "DateTime"
            r2 = 0
            r0.setAttribute(r1, r2)
            androidx.exifinterface.media.ExifInterface r0 = r3.mExifInterface
            java.lang.String r1 = "DateTimeOriginal"
            r0.setAttribute(r1, r2)
            androidx.exifinterface.media.ExifInterface r0 = r3.mExifInterface
            java.lang.String r1 = "DateTimeDigitized"
            r0.setAttribute(r1, r2)
            androidx.exifinterface.media.ExifInterface r0 = r3.mExifInterface
            java.lang.String r1 = "SubSecTime"
            r0.setAttribute(r1, r2)
            androidx.exifinterface.media.ExifInterface r0 = r3.mExifInterface
            java.lang.String r1 = "SubSecTimeOriginal"
            r0.setAttribute(r1, r2)
            androidx.exifinterface.media.ExifInterface r0 = r3.mExifInterface
            java.lang.String r1 = "SubSecTimeDigitized"
            r0.setAttribute(r1, r2)
            r0 = 1
            r3.mRemoveTimestamp = r0
            return
    }

    public void rotate(int r10) {
            r9 = this;
            int r0 = r10 % 90
            r1 = 1
            java.lang.String r2 = "Orientation"
            if (r0 == 0) goto L27
            java.lang.String r0 = androidx.camera.core.impl.utils.Exif.TAG
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r4 = 0
            r1[r4] = r10
            java.lang.String r10 = "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported."
            java.lang.String r10 = java.lang.String.format(r3, r10, r1)
            androidx.camera.core.Logger.w(r0, r10)
            androidx.exifinterface.media.ExifInterface r10 = r9.mExifInterface
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r10.setAttribute(r2, r0)
            return
        L27:
            int r10 = r10 % 360
            int r0 = r9.getOrientation()
        L2d:
            r3 = 5
            r4 = 7
            r5 = 4
            r6 = 2
            r7 = 8
            r8 = 6
            if (r10 >= 0) goto L4a
            int r10 = r10 + 90
            switch(r0) {
                case 2: goto L48;
                case 3: goto L3e;
                case 4: goto L46;
                case 5: goto L44;
                case 6: goto L42;
                case 7: goto L40;
                case 8: goto L3e;
                default: goto L3b;
            }
        L3b:
            r0 = 8
            goto L2d
        L3e:
            r0 = 6
            goto L2d
        L40:
            r0 = 2
            goto L2d
        L42:
            r0 = 1
            goto L2d
        L44:
            r0 = 4
            goto L2d
        L46:
            r0 = 7
            goto L2d
        L48:
            r0 = 5
            goto L2d
        L4a:
            if (r10 <= 0) goto L62
            int r10 = r10 + (-90)
            switch(r0) {
                case 2: goto L60;
                case 3: goto L5d;
                case 4: goto L5b;
                case 5: goto L59;
                case 6: goto L57;
                case 7: goto L55;
                case 8: goto L53;
                default: goto L51;
            }
        L51:
            r0 = 6
            goto L4a
        L53:
            r0 = 1
            goto L4a
        L55:
            r0 = 4
            goto L4a
        L57:
            r0 = 3
            goto L4a
        L59:
            r0 = 2
            goto L4a
        L5b:
            r0 = 5
            goto L4a
        L5d:
            r0 = 8
            goto L4a
        L60:
            r0 = 7
            goto L4a
        L62:
            androidx.exifinterface.media.ExifInterface r10 = r9.mExifInterface
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10.setAttribute(r2, r0)
            return
    }

    public void save() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.mRemoveTimestamp
            if (r0 != 0) goto L7
            r1.attachLastModifiedTimestamp()
        L7:
            androidx.exifinterface.media.ExifInterface r0 = r1.mExifInterface
            r0.saveAttributes()
            return
    }

    public void setDescription(@androidx.annotation.Nullable java.lang.String r3) {
            r2 = this;
            androidx.exifinterface.media.ExifInterface r0 = r2.mExifInterface
            java.lang.String r1 = "ImageDescription"
            r0.setAttribute(r1, r3)
            return
    }

    public void setOrientation(int r3) {
            r2 = this;
            androidx.exifinterface.media.ExifInterface r0 = r2.mExifInterface
            java.lang.String r1 = "Orientation"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.setAttribute(r1, r3)
            return
    }

    public java.lang.String toString() {
            r11 = this;
            java.util.Locale r0 = java.util.Locale.ENGLISH
            int r1 = r11.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r11.getHeight()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r11.getRotation()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r4 = r11.isFlippedVertically()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r5 = r11.isFlippedHorizontally()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            android.location.Location r6 = r11.getLocation()
            long r7 = r11.getTimestamp()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.String r8 = r11.getDescription()
            r9 = 8
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r10 = 0
            r9[r10] = r1
            r1 = 1
            r9[r1] = r2
            r1 = 2
            r9[r1] = r3
            r1 = 3
            r9[r1] = r4
            r1 = 4
            r9[r1] = r5
            r1 = 5
            r9[r1] = r6
            r1 = 6
            r9[r1] = r7
            r1 = 7
            r9[r1] = r8
            java.lang.String r1 = "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}"
            java.lang.String r0 = java.lang.String.format(r0, r1, r9)
            return r0
    }
}
