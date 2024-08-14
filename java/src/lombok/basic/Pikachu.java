package lombok.basic;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pikachu {
	private int energy;
	private String type;
	private int level;
}
