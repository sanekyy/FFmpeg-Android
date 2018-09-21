package nl.bravobit.ffmpeg;

public interface FFcommandExecuteResponseHandler extends ResponseHandler {

    /**
     * on Success
     *
     * @param message complete output of the binary command
     */
    void onSuccess(String message);

    /**
     * on Progress
     *
     * @param message current output of binary command
     * @param progress current progress from 0.0 to 1.0
     */
    void onProgress(String message, float progress);

    /**
     * on Failure
     *
     * @param message complete output of the binary command
     */
    void onFailure(String message);

}
