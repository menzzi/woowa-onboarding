package bridge;

import bridge.domain.Bridge;

import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public static boolean move(List<String> answerBridge,Bridge userBridge, String direction,int idx) {
        if(compareBridge(answerBridge,direction,idx)){
            userBridge.updateBridgeStatus(direction,true);
            return true;
        }
        userBridge.updateBridgeStatus(direction,false);
        return false;
    }

    public static boolean compareBridge(List<String> answerBridge, String direction, int idx){
        if(answerBridge.get(idx).equals(direction)){
            return true;
        }
        return false;
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public static Bridge retry() {
        return new Bridge();
    }
}
