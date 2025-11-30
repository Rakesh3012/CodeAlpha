import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Map<String, String> knowledgeBase = new HashMap<>();

    public static void main(String[] args) {
        initKnowledgeBase();
        System.out.println("AI Chatbot: Hello! I am your assistant. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String input = sc.nextLine().trim().toLowerCase();

            if (input.equals("bye")) {
                System.out.println("AI Chatbot: Goodbye! Have a nice day.");
                break;
            }

            String response = getResponse(input);
            System.out.println("AI Chatbot: " + response);
        }
    }

    static void initKnowledgeBase() {
        knowledgeBase.put("hello", "Hello! How can I help you today?");
        knowledgeBase.put("hi", "Hi there! How can I assist you?");
        knowledgeBase.put("how are you", "I'm an AI, I don't have feelings, but I'm here to help you!");
        knowledgeBase.put("your name", "I am ChatbotAI, your virtual assistant.");
        knowledgeBase.put("help", "Sure! I can help you with basic queries. Ask me anything.");
        knowledgeBase.put("java", "Java is a programming language used for building applications.");
        knowledgeBase.put("who created you", "I was created by an awesome developer using Java!");
        knowledgeBase.put("what is ai", "AI stands for Artificial Intelligence. It's about creating smart machines.");
    }

    static String getResponse(String input) {
        for (String key : knowledgeBase.keySet()) {
            if (input.contains(key)) return knowledgeBase.get(key);
        }
        return "Sorry, I didn't understand that. Can you rephrase?";
    }
}