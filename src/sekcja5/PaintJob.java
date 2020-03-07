package sekcja5;

public class PaintJob {
    // Cw 28

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double bucketsNeeded = width * height / areaPerBucket;
        return Math.max( (int) (Math.ceil(bucketsNeeded)) - extraBuckets, 0 );
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        return getBucketCount(area, 1.0, areaPerBucket, 0);
    }
}
